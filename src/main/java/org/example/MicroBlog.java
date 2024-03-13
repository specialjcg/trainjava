package org.example;
import java.lang.Character;

public class MicroBlog {
    public String truncate(String text) {
        // Create a StringBuilder to handle Unicode characters properly
        StringBuilder truncatedText = new StringBuilder();

        // Loop through each code point in the input text
        for (int i = 0, codePoints = 0; i < text.length() && codePoints < 5; codePoints++) {
            // Get the code point of the current character
            int codePoint = text.codePointAt(i);

            // Append the character to the StringBuilder
            truncatedText.appendCodePoint(codePoint);

            // Move the index to the next code point
            i += Character.charCount(codePoint);
        }

        // Convert StringBuilder to a string
        return truncatedText.toString();
    }
}

