package org.example;

import java.util.HashSet;
import java.util.Set;

public class SumOfMultiples {
    private int number;
    private int[] set;

    public SumOfMultiples(int number, int[] set) {
        this.number = number;
        this.set = set;
    }

    public int getSum() {
        int sum = 0;
        Set<Integer> multiples = new HashSet<>();

        for (int factor : set) {
            if (factor == 0) continue; // Skip division by zero
            int maxMultiple = (number - 1) / factor;
            for (int i = 1; i <= maxMultiple; i++) {
                multiples.add(i * factor);
            }
        }

        for (int num : multiples) {
            sum += num;
        }

        return sum;
    }
}
