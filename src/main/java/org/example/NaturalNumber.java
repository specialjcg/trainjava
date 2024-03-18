package org.example;
enum Classification {

    DEFICIENT, PERFECT, ABUNDANT

}
public class NaturalNumber {
    private final int number;

    public NaturalNumber(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("Number must be positive.");
        }
        this.number = number;
    }

    public Classification getClassification() {
        int aliquotSum = calculateAliquotSum(number);

        if (aliquotSum == number) {
            return Classification.PERFECT;
        } else if (aliquotSum < number) {
            return Classification.DEFICIENT;
        } else {
            return Classification.ABUNDANT;
        }
    }

    private int calculateAliquotSum(int number) {
        int sum = 0;
        for (int i = 1; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                sum += i;
                if (i * i != number) {
                    sum += number / i;
                }
            }
        }
        return sum - number;
    }
}