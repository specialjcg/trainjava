package org.example;

public class Acronym {
    private final String phrase;

    public Acronym(String phrase) {
        this.phrase = phrase;
    }

    public String get() {
        String[] words = phrase.replaceAll("[^a-zA-Z0-9\\s-]", "").split("[^a-zA-Z0-9]+");
        StringBuilder acronym = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                acronym.append(word.charAt(0));
            }
        }
        return acronym.toString().toUpperCase();
    }
}
