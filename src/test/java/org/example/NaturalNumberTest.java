package org.example;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
public class NaturalNumberTest {
    @Test
    public void testSmallPerfectNumberIsClassifiedCorrectly() {
        assertThat(new NaturalNumber(6).getClassification()).isEqualTo(Classification.PERFECT);
    }

    @Test
    public void testMediumPerfectNumberIsClassifiedCorrectly() {
        assertThat(new NaturalNumber(28).getClassification()).isEqualTo(Classification.PERFECT);
    }

    @Test
    public void testLargePerfectNumberIsClassifiedCorrectly() {
        assertThat(new NaturalNumber(33550336).getClassification()).isEqualTo(Classification.PERFECT);
    }

    @Test
    public void testSmallAbundantNumberIsClassifiedCorrectly() {
        assertThat(new NaturalNumber(12).getClassification()).isEqualTo(Classification.ABUNDANT);
    }

    @Test
    public void testMediumAbundantNumberIsClassifiedCorrectly() {
        assertThat(new NaturalNumber(30).getClassification()).isEqualTo(Classification.ABUNDANT);
    }

    @Test
    public void testLargeAbundantNumberIsClassifiedCorrectly() {
        assertThat(new NaturalNumber(33550335).getClassification()).isEqualTo(Classification.ABUNDANT);
    }

    @Test
    public void testSmallestPrimeDeficientNumberIsClassifiedCorrectly() {
        assertThat(new NaturalNumber(2).getClassification()).isEqualTo(Classification.DEFICIENT);
    }

    @Test
    public void testSmallestNonPrimeDeficientNumberIsClassifiedCorrectly() {
        assertThat(new NaturalNumber(4).getClassification()).isEqualTo(Classification.DEFICIENT);
    }

}