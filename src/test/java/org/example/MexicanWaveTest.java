package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MexicanWaveTest {
    @Test
    @Tag("task:5")
    @DisplayName("The clean method returns the correct result after performing a few cleaning operations")
    public void combine_conversions() {
        assertEquals("_AbcĐCTRL", MexicanWave.clean("9 -abcĐ\uD83D\uDE00ω\0"));

    }
}