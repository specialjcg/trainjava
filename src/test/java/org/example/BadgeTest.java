package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BadgeTest {
    @Test
    public void printaBadgeforAnEmployee() {
        Badge badge = new Badge();


        assertEquals("[734] - Ernest Johnny Payne - STRATEGIC COMMUNICATION", badge.print(734, "Ernest Johnny Payne", "Strategic Communication"));
    }
    @Test
    public void printaBadgeforANewEmployee() {
        Badge badge = new Badge();


        assertEquals("Bogdan Rosario - MARKETING",
                     badge.print(null, "Bogdan Rosario", "Marketing"));
    }
    @Test
    @Tag("task:3")
    @DisplayName("Printing a badge for the owner")
    public void labelForOwner() {
        Badge badge = new Badge();
        assertEquals(badge.print(59, "Julie Sokato", null),"[59] - Julie Sokato - OWNER");
    }
    @Test
    @Tag("task:3")
    @DisplayName("Printing a badge for the owner who is a new employee")
    public void labelForNewOwner() {
        Badge badge = new Badge();
        assertEquals(badge.print(null, "Amare Osei", null),"Amare Osei - OWNER");
    }
}