package org.example;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SmileFaces {
    public static int countSmileys(List<String>  simleys) {
        int count = 0;
        for (String text : simleys) {

            if (text.length()== 3) {
                if (text.charAt(0) == ':' || text.charAt(0) == ';') {
                    if (text.charAt(1) == '-' || text.charAt(1) == '~') {
                        if ((text.charAt(2) == ')' || text.charAt(2) == 'D')) {
                            count++;
                        }
                    }}



            }
            if (text.length()== 2) {
                if (text.charAt(0) == ':' || text.charAt(0) == ';') {
                    if (text.charAt(1) == '-' || text.charAt(1) == '~') {
                        if ((text.charAt(2) == ')' || text.charAt(2) == 'D' )) {
                            count++;
                        }
                    }else if (text.charAt(1) == ')' || text.charAt(1) == 'D') {
                        count++;
                    }
                }

            }
        }

            // Define a regex pattern for valid smiley faces

            // Create a matcher for the input text

            // Count the number of valid smiley faces

            return count;

    }
//    public static int countSmileys(List<String> arr) {
//        return (int)arr.stream().filter( x -> x.matches("[:;][-~]?[)D]")).count();
//    }
}
