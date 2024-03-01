package org.example;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorConundrumTest {
    @Test
    @Tag("task:1")
    @DisplayName("The calculate method returns the correct result when adding small operands")
    public void additionWithSmallOperands() {
        assertEquals("**", new CalculatorConundrum().calculate(22, 25, "**"));
    }

}