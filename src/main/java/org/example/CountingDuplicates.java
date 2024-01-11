package org.example;

import java.util.HashSet;
import java.util.Set;

//Count the number of Duplicates
//    Write a function that will return the count of distinct case-insensitive
//    alphabetic characters and numeric digits that occur more than once in the input string.
//    The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.
//
//    Example
//    "abcde" -> 0 # no characters repeats more than once
//    "aabbcde" -> 2 # 'a' and 'b'
//    "aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
//    "indivisibility" -> 1 # 'i' occurs six times
//    "Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice
//    "aA11" -> 2 # 'a' and '1'
//    "ABBA" -> 2 # 'A' and 'B' each occur twice
public class CountingDuplicates {
    public static int duplicateCount(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }

        Set<Character> seenCharacters = new HashSet<>();
        Set<Character> duplicateCharacters = new HashSet<>();
        input = input.toLowerCase(); // Convert to lowercase for case-insensitivity

        for (char c : input.toCharArray()) {
            if (seenCharacters.contains(c)) {
                duplicateCharacters.add(c);
            } else {
                seenCharacters.add(c);
            }
        }

        return duplicateCharacters.size();
    }
}