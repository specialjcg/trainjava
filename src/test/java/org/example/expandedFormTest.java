package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class expandedFormTest {
    @Test
    public void testSomething() {
        assertEquals("10 + 2", expandedForm.expandedForm(12));
        assertEquals("40 + 2", expandedForm.expandedForm(42));
        assertEquals("70000 + 300 + 4", expandedForm.expandedForm(70304));
    }
}