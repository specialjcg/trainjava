package org.example;

import java.util.Arrays;
import java.util.stream.Stream;

public class SpinWords {
    public String spinWords(String sentence) {

        // Perform operations on StringBuilder if needed
        return String.join(" ", Stream.of(sentence.split(" "))

            .map(x ->x.length()>=5?new StringBuilder(x).reverse().toString():new StringBuilder(x).toString())
            .toArray(String[]::new));
    }
}