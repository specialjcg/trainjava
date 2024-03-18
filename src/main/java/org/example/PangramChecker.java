package org.example;

import java.util.HashSet;
import java.util.Set;

public class PangramChecker {
    public static boolean isPangram(String sentence) {
        sentence = sentence.toLowerCase().replaceAll("[^a-z]", "");

        Set<java.lang.Character> chars = new HashSet<>();
        for (char c : sentence.toCharArray()) {
            chars.add(c);
        }
        return chars.size() == 26;
    }

}
