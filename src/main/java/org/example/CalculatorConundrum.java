package org.example;

public class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        if (operation == null) {
            throw new IllegalArgumentException("Operation cannot be null");
        }
        if (operand2 == 0 && operation.equals("/")) {
            throw new IllegalOperationException("Cannot divide by zero");

        }
        return switch (operation) {
            case "+" -> operand1+ " + " + operand2+" = "+ String.valueOf(operand1 + operand2);
            case "*" -> operand1+ " * " + operand2+" = "+String.valueOf(operand1 * operand2);
            case "/" -> operand1+ " / " + operand2+" = "+String.valueOf(operand1 / operand2);
            case "-" -> throw new IllegalArgumentException("Operation '-' does not exist");
            case "" ->throw new IllegalArgumentException("Operation cannot be empty");
            default -> throw new IllegalOperationException(String.format("Operation '%s' does not exist", operation));
        };


    }
}
