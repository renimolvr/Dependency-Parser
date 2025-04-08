package com.orange.labs.conllparser;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class SDParse {
    private ConllSentence sent;

    public SDParse(String contents) throws IOException, ConllException {
        InputStream is = new ByteArrayInputStream(contents.getBytes(StandardCharsets.UTF_8));
        parse(is);
    }

    public SDParse(File infile) throws IOException, ConllException {
        FileInputStream fis = new FileInputStream(infile);
        parse(fis);
    }

    public SDParse(InputStream instream) throws IOException, ConllException {
        parse(instream);
    }

    private void parse(InputStream instream) throws IOException, ConllException {
        BufferedReader br = new BufferedReader(new InputStreamReader(instream, StandardCharsets.UTF_8));

        String line;
        StringBuilder output = new StringBuilder();  // Store parsed output

        while ((line = br.readLine()) != null) {
            line = line.trim();
            if (!line.isEmpty() && !line.startsWith("#")) {
                output.append(line).append("\n");  // Save sentence
            }
        }

        // ✅ Save parsed output inside `/output/`
        File outputDir = new File("output");
        if (!outputDir.exists()) {
            outputDir.mkdir();  // Create output folder if not exists
        }

        File outputFile = new File(outputDir, "tree.conllu");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            writer.write(output.toString());
            System.out.println("tree.conllu");  // Output file name for Flask
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ConllSentence getSentence() {
        return sent;
    }

    public static void main(String args[]) throws ConllException, IOException {
        if (args.length == 0) {
            System.out.println("Error: No input provided.");
            return;
        }

        try {
            SDParse sdp = new SDParse(new File(args[0]));

            // ✅ Save dependency tree output
            File outputDir = new File("output");
            if (!outputDir.exists()) outputDir.mkdir();

            File outputFile = new File(outputDir, "tree.conllu");
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
                writer.write(sdp.getSentence().toString());
                System.out.println("tree.conllu");  // Output file name for Flask
            }
        } catch (ConllException e) {
            System.out.println("sdparse error: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO error: " + e.getMessage());
        }
    }
}
