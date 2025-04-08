document.addEventListener('DOMContentLoaded', function() {
    const parseBtn = document.getElementById('parse-btn');
    const sentenceInput = document.getElementById('sentence');
    const resultContainer = document.getElementById('result-container');
    const resultContent = document.getElementById('result');
    
    // Disable button if textarea is empty
    sentenceInput.addEventListener('input', function() {
        parseBtn.disabled = !this.value.trim();
    });
    
    // Handle form submission
    parseBtn.addEventListener('click', function() {
        const sentence = sentenceInput.value.trim();
        
        if (!sentence) return;
        
        // Show loading state
        parseBtn.disabled = true;
        parseBtn.innerHTML = `
            <svg class="spinner" xmlns="http://www.w3.org/2000/svg" width="16" height="16" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round">
                <circle cx="12" cy="12" r="10"></circle>
                <path d="M16 12a4 4 0 1 1-8 0"></path>
            </svg>
            Processing...
        `;
        resultContainer.classList.add('hidden');
        
        // Send request to backend
        fetch('/parse', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json',
            },
            body: JSON.stringify({ sentence }),
        })
        .then(response => {
            if (!response.ok) {
                throw new Error('Network response was not ok');
            }
            return response.json();
        })
        .then(data => {
            // Display result
            resultContent.textContent = data.result;
            resultContainer.classList.remove('hidden');
        })
        .catch(error => {
            console.error('Error:', error);
            resultContent.textContent = 'Error parsing sentence. Please try again.';
            resultContainer.classList.remove('hidden');
        })
        .finally(() => {
            // Reset button state
            parseBtn.disabled = false;
            parseBtn.innerHTML = `
                <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="icon">
                    <line x1="22" y1="2" x2="11" y2="13"></line>
                    <polygon points="22 2 15 22 11 13 2 9 22 2"></polygon>
                </svg>
                Parse Sentence
            `;
        });
    });

    document.getElementById("submit-btn").addEventListener("click", function(event) {
        let inputText = document.getElementById("sentence-input").value;
        let malayalamRegex = /^[\u0D00-\u0D7F\s]+$/; // Malayalam Unicode range
    
        if (!malayalamRegex.test(inputText)) {
            event.preventDefault(); // Stop form submission
            document.getElementById("error-message").innerText = "Please enter a Malayalam sentence.";
            document.getElementById("error-message").style.color = "red";
        } else {
            document.getElementById("error-message").innerText = ""; // Clear error if valid
        }
    });
    
    
    // Add spinner animation
    const style = document.createElement('style');
    style.textContent = `
        .spinner {
            animation: spin 1s linear infinite;
        }
        
        @keyframes spin {
            0% { transform: rotate(0deg); }
            100% { transform: rotate(360deg); }
        }
    `;
    document.head.appendChild(style);
});