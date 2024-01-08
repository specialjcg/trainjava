package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static Integer parseNumeric(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public static String timeCorrect(String timestring) {
        if (timestring == null) return null;
        if (timestring.split(":").length != 3) {
            return null;
        }
        String[] timeArray = timestring.split(":");

        for (int i = 0; i < 3; i++) {
            if (timeArray[i].equals("0")) {
                return null;
            }
            if (timeArray[i].equals("000")) {
                return null;
            }
            if (timeArray[i].equals("0/")) {
                return null;
            }
            if (timeArray[i].equals("-0")) {
                return null;
            }
        }
        Integer timeDay = 0;


        Integer retenu = 0;
        ArrayList<String> timeList = new ArrayList<>(Arrays.asList(timeArray));
        ArrayList<String> newTimeArray = new ArrayList<>();

        for (int i = timeList.size() - 1; i >= 0; i--) {
            String time = timeList.get(i);

            // Assuming parseNumeric returns Integer
            Integer newTime = parseNumeric(time) + retenu;
            retenu = 0;
            if (newTime > 59 && i != 0) {
                newTime = newTime - 60;
                retenu = 1;
            }
            if (i == 0) {
                newTime = newTime % 24;
            }
            if (newTime < 10) {
                newTimeArray.add(0, "0" + newTime.toString());
            } else {
                newTimeArray.add(0, newTime.toString());
            }
            // Add newTime to the beginning of newTimeArray
        }
        String[] stringArray = newTimeArray.stream()
            .map(String::valueOf)
            .toArray(String[]::new);


        // Join the elements with ":"
        String result = String.join(":", stringArray);

        return result;
        // your code here
    }

}