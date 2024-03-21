package org.example;

public class CollatzCalculator {
    public int computeStepCount(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("Only positive integers are allowed");
        }
        return (i == 1) ? 0 : 1 + computeStepCount((i % 2 == 0) ? i / 2 : 3 * i + 1);
    }
}
