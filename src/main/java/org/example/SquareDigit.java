package org.example;

import java.util.stream.Collectors;

import static java.lang.Integer.parseInt;

public class SquareDigit {
    public int squareDigits(int n) {
        return Integer.parseInt(String.valueOf(n)
                                    .chars()
                                    .map(i -> Integer.parseInt(String.valueOf((char) i)))
                                    .map(i -> i * i)
                                    .mapToObj(String::valueOf)
                                    .collect(Collectors.joining("")));
    }
}
