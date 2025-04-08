from flask import Flask, render_template, request, redirect, send_file, url_for
from ufal.udpipe import Model, Pipeline, ProcessingError
import subprocess
import json
import time, os, signal, uuid, atexit, sys, tempfile, threading

app = Flask(__name__)
editor_process = None

#Store files in upload and download section
UPLOAD_FOLDER = os.path.join(os.getcwd(), "uploads")
OUTPUT_FOLDER = os.path.join(os.getcwd(), "outputs")

os.makedirs(UPLOAD_FOLDER, exist_ok=True)
os.makedirs(OUTPUT_FOLDER, exist_ok=True)

# Load UDPipe model
model_path = "malayalam-model_740.udpipe"
model = Model.load(model_path)
if not model:
    raise Exception(f"Cannot load model from {model_path}")

pipeline = Pipeline(model, "tokenize", Pipeline.DEFAULT, Pipeline.DEFAULT, "conllu")
error = ProcessingError()

def cleanup():
    """Terminate the editor process if it is running."""
    global editor_process
    if editor_process:
        try:
            os.killpg(os.getpgid(editor_process.pid), signal.SIGTERM)
            editor_process.wait(timeout=5)
        except Exception:
            os.killpg(os.getpgid(editor_process.pid), signal.SIGKILL)
        editor_process = None

# Register cleanup to be called on exit
atexit.register(cleanup)
signal.signal(signal.SIGINT, lambda signum, frame: (cleanup(), sys.exit(0)))
signal.signal(signal.SIGTERM, lambda signum, frame: (cleanup(), sys.exit(0)))

def delayed_remove(filename, delay=10):
    """Wait for delay seconds then remove the given file."""
    time.sleep(delay)
    try:
        os.remove(filename)
    except Exception as e:
        print(f"Error removing temporary file: {e}")

@app.route("/", methods=["GET", "POST"])
def index():
    global editor_process
    show_output = False
    timestamp = str(int(time.time()))  # Ensure iframe refreshes

    if request.method == "POST":
        sentence = request.form["sentence"]

        # Process the new sentence using UDPipe
        processed = pipeline.process(sentence, error)
        if error.occurred():
            return f"Error: {error.message}"

        # Create a unique file for each sentence
        output_file = f"/tmp/output_{timestamp}.conllu"
        with open(output_file, "w", encoding="utf-8") as temp_file:
            temp_file.write(processed)

        # ✅ Start ConlluEditor only if it is not already running
        if editor_process is None or editor_process.poll() is not None:
            command = [
                    os.path.abspath("bin/conlluedit.sh"),
                    "-r",
                    output_file,
                    "8888"
                    ]
            try:
                editor_process = subprocess.Popen(
                    command,
                    cwd="/",
                    preexec_fn=os.setsid
                )
                time.sleep(3)  # Allow time for the editor to start
            except subprocess.CalledProcessError as e:
                return f"Error launching CoNLL-U editor: {e}"

        # ✅ Send new file to ConlluEditor without restarting it
        else:
            reload_command = [
                "curl",
                "-X",
                "POST",
                f"http://127.0.0.1:8888/edit/",
                "-H",
                "Content-Type: application/json",
                "--data",
                f'{{"command":["read",0],"sid":0,"data":"{output_file}"}}'
            ]
            subprocess.run(reload_command, capture_output=True, text=True)

        show_output = True

    return render_template("home.html", show_output=show_output, timestamp=timestamp)

ALLOWED_EXTENSIONS = {'txt'}

def allowed_file(filename):
    return '.' in filename and filename.rsplit('.', 1)[1].lower() in ALLOWED_EXTENSIONS

@app.route('/about')
def about():
    return render_template('about.html')

@app.route('/guidelines')
def guidelines():
    return render_template('guidelines.html')

@app.route('/description')
def description():
    return render_template('description.html')

@app.route('/upload')
def upload():
    return render_template('upload.html',show_download=False)

@app.route('/pos')
def pos():
    return render_template('pos.html')

@app.route('/dependency')
def dependency():
    return render_template('dependency.html')

@app.route("/reset", methods=["POST"])
def reset():
    global editor_process
    if editor_process:
        try:
            os.killpg(os.getpgid(editor_process.pid), signal.SIGTERM)
            editor_process.wait(timeout=5)
        except Exception:
            os.killpg(os.getpgid(editor_process.pid), signal.SIGKILL)
        editor_process = None
    return "", 204

@app.route("/upload", methods=["POST"])
def upload_file():
    if "file" not in request.files:
        return "No file part"
    
    file = request.files["file"]
    if file.filename == "":
        return "No selected file"

    if not allowed_file(file.filename):
        return "Error: Only .txt files are allowed!", 400

    filepath = os.path.join(UPLOAD_FOLDER, file.filename)
    file.save(filepath)

    # Process the file using UDPipe
    with open(filepath, "r", encoding="utf-8") as f:
        text = f.read()
    
    processed = pipeline.process(text, error)
    if error.occurred():
        return f"Error: {error.message}"
    
    output_filename = file.filename.rsplit(".", 1)[0] + ".conllu"
    output_path = os.path.join(OUTPUT_FOLDER, output_filename)
    
    with open(output_path, "w", encoding="utf-8") as f:
        f.write(processed)

    # Extract sentences and their corresponding CoNLL-U data
    raw_sentences = text.strip().split("\n")  # Extract original sentences
    conllu_sentences = processed.strip().split("\n\n")  # Split into CoNLL-U formatted sentences
    table_data = []

    for i, sentence in enumerate(conllu_sentences):
        rows = []
        for line in sentence.split("\n"):
            if line and not line.startswith("#"):  # Ignore comments
                columns = line.split("\t")
                if len(columns) == 10:  # Ensure correct format
                    rows.append(columns)
        if rows:
            table_data.append((raw_sentences[i], rows))  # Store (sentence, table_rows)

    # ✅ Pass the enumerated list directly
    table_data = list(enumerate(table_data))
    return render_template("upload.html", table_data=table_data, total_tables=len(table_data))
    
@app.route("/save_edit", methods=["POST"])
def save_edit():
    data = request.json["table_data"]
    output_filename = "edited_output.conllu"
    output_path = os.path.join(OUTPUT_FOLDER, output_filename)

    with open(output_path, "w", encoding="utf-8") as f:
        for sentence_data in data:
            for row in sentence_data:
                f.write("\t".join(row) + "\n")
            f.write("\n")  # Separate sentences

    return json.dumps({"filename": output_filename})

@app.route("/download/<filename>")
def download(filename):
    return send_file(os.path.join(OUTPUT_FOLDER, filename), as_attachment=True)

if __name__ == "__main__":
    app.run(debug=True, host="0.0.0.0")
