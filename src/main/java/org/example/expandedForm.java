package org.example;
//You will be given a number and you will need to return it as a string in Expanded Form. For example:
//
//    Kata.expandedForm(12); # Should return "10 + 2"
//    Kata.expandedForm(42); # Should return "40 + 2"
//    Kata.expandedForm(70304); # Should return "70000 + 300 + 4"
//    NOTE: All numbers will be whole numbers greater than 0.
//
//    If you liked this kata, check out part 2!!


import java.util.Arrays;

import static java.lang.Integer.parseInt;

public class expandedForm {
    public static String expandedForm(int num)
    {
        String[] result = Integer.toString(num).split("");
        for (int i = 0; i < result.length; i++) {
            if (result[i].equals("0")) {
                result[i] = "";
            }else{
                result[i] = parseInt(result[i])*(int)Math.pow(10, result.length-1-i)+"";

            }
        }
        return String.join(" + ", Arrays.stream(result)
            .filter(str -> !str.isEmpty())
            .toArray(String[]::new));
    }
//    public static String expandedForm(int num)
//    {
//        String outs = "";
//        for (int i = 10; i < num; i *= 10) {
//            int rem = num % i;
//            outs = (rem > 0) ? " + " + rem + outs : outs;
//            num -= rem;
//        }
//        outs = num + outs;
//
//        return outs;
//    }
//public static String expandedForm(int num)
//{
//    return IntStream.range(0, String.valueOf(num).length())
//        .mapToObj(x -> String.valueOf( Character.getNumericValue(String.valueOf(num).charAt(x) ) * (int)Math.pow(10, String.valueOf(num).substring(x).length()-1)))
//        .filter(x -> !x.equals("0"))
//        .collect(Collectors.joining(" + "));
//}

}
