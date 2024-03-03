package org.example;

public class ArmstrongNumbers {
    boolean isArmstrongNumber(int numberToCheck) {

        String numStr = String.valueOf(numberToCheck);
        int numDigits = numStr.length();

        // Calculate the sum of digits raised to the power of the number of digits
        int sum = 0;
        int temp = numberToCheck;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, numDigits);
            temp /= 10;
        }

        // Check if the sum is equal to the original number
        return sum == numberToCheck;

    }
}
