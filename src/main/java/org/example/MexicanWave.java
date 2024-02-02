package org.example;

public class MexicanWave {
    public static String kebabToCamel(String kebabCase) {
        StringBuilder camelCaseBuilder = new StringBuilder();

        // Split the kebab-case string by dashes
        String[] parts = kebabCase.replaceAll("[^\\p{L}_-]", "").replaceAll("[α-ω]", "").split("-");
        camelCaseBuilder.append(parts[0]);

        // Capitalize the first letter of each subsequent part and append to the result
        for (int i = 1; i < parts.length; i++) {
            camelCaseBuilder.append(capitalizeAfterHyphen(parts[i]));
        }

        return camelCaseBuilder.toString();
    }

    private static String capitalizeAfterHyphen(String word) {
        // Capitalize the first letter of a word
        return  word.substring(0,1).toUpperCase() + word.substring(1);
    }


    static String clean(String identifier) {

        return kebabToCamel(identifier.replace(" ","_").replace("\0", "CTRL")
                                .replace("\r", "CTRL")
                                .replace("\u007F", "CTRL")).replaceAll("-\\d+", "");

    }
}
