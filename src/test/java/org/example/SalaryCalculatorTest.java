package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryCalculatorTest {
    private SalaryCalculator calculator;
    @BeforeEach
    public void setUp() {
        calculator = new SalaryCalculator();
    }

    @Test
    @Tag("task:1")
    @DisplayName("The salaryMultiplier method returns 1.0 when daysSkipped is below the threshold")
    public void msalaryMultiplierWhenDaysSkippedIs4() {
        assertEquals(1.0, calculator.salaryMultiplier(4));
    }
    @Test
    @Tag("task:1")
    @DisplayName("The salaryMultiplier method returns 0.85 when daysSkipped is equal to the threshold")
    public void salaryMultiplierWhenDaysSkippedIs5() {
        assertEquals(0.85, calculator.salaryMultiplier(5));
    }
    @Test
    @Tag("task:1")
    @DisplayName("The bonusMultiplier method returns 0.85 when daysSkipped is above the threshold")
    public void salaryMultiplierWhenDaysSkippedIs6() {
        assertEquals(0.85, calculator.salaryMultiplier(6));
    }
    @Test
    @Tag("task:2")
    @DisplayName("The bonusForProductsSold method returns the right result")
    public void bonusForProductsSoldWhenProductsSoldIs5() {
        assertEquals(50, calculator.bonusForProductsSold(5));
    }
    @Test
    @Tag("task:2")
    @DisplayName("The bonusMultiplier method returns 10 when productsSold is below the threshold")
    public void bonusMultiplierWhenProductsSoldIs19() {
        assertEquals(10, calculator.bonusMultiplier(19));
    }
    @Test
    @Tag("task:2")
    @DisplayName("The bonusMultiplier method returns 13 when productsSold is equal to the threshold")
    public void bonusMultiplierWhenProductsSoldIs20() {
        assertEquals(13, calculator.bonusMultiplier(20));
    }
    @Test
    @Tag("task:2")
    @DisplayName("The bonusMultiplier method returns 13 when productsSold is above the threshold")
    public void bonusMultiplierWhenProductsSoldIs21() {
        assertEquals(13, calculator.bonusMultiplier(21));
    }
    @Test
    @Tag("task:3")
    @DisplayName("The finalSalary method returns the correct result capped at maximum salary")
    public void salaryRespectMaximum() {
        assertEquals(2000.0, calculator.finalSalary(0, 77));
    }
    @Test
    @Tag("task:3")
    @DisplayName("The finalSalary method returns the regular salary without multiplier and bonus")
    public void regularSalary() {
        assertEquals(1000.0, calculator.finalSalary(0, 0));
    }
    @Test
    @Tag("task:3")
    @DisplayName("The finalSalary method returns the correct result when daysSkipped above threshold")
    public void skippedAboveThreshold() {
        assertEquals(850.0, calculator.finalSalary(7, 0));
    }
    @Test
    @Tag("task:3")
    @DisplayName("The finalSalary method returns the correct result when daysSkipped and productsSold below threshold")
    public void skippedBelowThresholdAndSoldBelowThreshold() {
        assertEquals(1050.0, calculator.finalSalary(2, 5));
    }
}