package org.example;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
public class CollatzCalculatorTest {
    private CollatzCalculator collatzCalculator = new CollatzCalculator();
    @Test
    public void testZeroStepsRequiredWhenStartingFrom1() {
        assertThat(collatzCalculator.computeStepCount(1)).isEqualTo(0);
    }
    @Test
    public void testCorrectNumberOfStepsWhenAllStepsAreDivisions() {
        assertThat(collatzCalculator.computeStepCount(16)).isEqualTo(4);
    }
    @Test
    public void testCorrectNumberOfStepsWhenBothStepTypesAreNeeded() {
        assertThat(collatzCalculator.computeStepCount(12)).isEqualTo(9);
    }
    @Test
    public void testAVeryLargeInput() {
        assertThat(collatzCalculator.computeStepCount(1000000)).isEqualTo(152);
    }

}