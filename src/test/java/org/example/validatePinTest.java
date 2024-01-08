package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class validatePinTest {
    @Test
    public void validPins() {
        assertEquals(true, validatePin.validatePin("1234"));
        assertEquals(true, validatePin.validatePin("0000"));
        assertEquals(true, validatePin.validatePin("1111"));
        assertEquals(true, validatePin.validatePin("123456"));
        assertEquals(true, validatePin.validatePin("098765"));
        assertEquals(true, validatePin.validatePin("000000"));
        assertEquals(true, validatePin.validatePin("090909"));
    }

    @Test
    public void nonDigitCharacters() {
        assertEquals(false, validatePin.validatePin("a234"));
        assertEquals(false, validatePin.validatePin(".234"));
    }

    @Test
    public void invalidLengths() {
        assertEquals(false, validatePin.validatePin("1"));
        assertEquals(false, validatePin.validatePin("12"));
        assertEquals(false, validatePin.validatePin("123"));
        assertEquals(false, validatePin.validatePin("12345"));
        assertEquals(false, validatePin.validatePin("1234567"));
        assertEquals(false, validatePin.validatePin("-1234"));
        assertEquals(false, validatePin.validatePin("1.234"));
        assertEquals(false, validatePin.validatePin("00000000"));
    }

}