package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
class CaptainsLogTest {
    @Test
    @Tag("task:1")
    @DisplayName("Generated planet classes are valid")
    public void testRandomPlanetClassIsValid() {
        var captainsLog = new CaptainsLog(new Random());
        for (int i = 0; i < 100; i++) {
            assertThat(captainsLog.randomPlanetClass()).isIn('D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y');
        }
    }
    @Test
    @Tag("task:2")
    @DisplayName("Generated ship registry numbers are valid")
    public void testRandomShipRegistryNumberIsValid() {
        var captainsLog = new CaptainsLog(new Random());
        for (int i = 0; i < 100; i++) {
            var shipRegistryNumber = captainsLog.randomShipRegistryNumber();
            var number = Integer.parseInt(shipRegistryNumber.substring(4));
            assertThat(number).isBetween(1000, 9999);
        }
    }
}