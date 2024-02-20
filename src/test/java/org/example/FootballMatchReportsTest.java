package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import static org.junit.jupiter.api.Assertions.*;

class FootballMatchReportsTest {
    @Test
    @Tag("task:1")
    @DisplayName("The onField method returns the correct description of player with shirt number 1")
    public void test_goal() {
        assertEquals("goalie", FootballMatchReports.onField(1));
    }
    @Test
    @Tag("task:1")
    @DisplayName("The onField method returns the correct description of player with shirt number 2")
    public void test_left_back() {
        assertEquals("left back", FootballMatchReports.onField(2));
    }
    @Test
    @Tag("task:1")
    @DisplayName("The onField method returns the correct description of player with shirt number 5")
    public void test_right_back() {
        assertEquals("right back", FootballMatchReports.onField(5));
    }
    @Test
    @Tag("task:1")
    @DisplayName("The onField method returns the correct description of players with shirt numbers 3 and 4")
    public void test_center_back() {
        assertEquals("center back", FootballMatchReports.onField(3));
        assertEquals("center back", FootballMatchReports.onField(4));

    }
    @Test
    @Tag("task:1")
    @DisplayName("The onField method returns the correct description of players with shirt numbers 6, 7 and 8")
    public void test_midfielder() {
        assertEquals("midfielder", FootballMatchReports.onField(6));
        assertEquals("midfielder", FootballMatchReports.onField(7));
        assertEquals("midfielder", FootballMatchReports.onField(8));

    }
    @Test
    @Tag("task:1")
    @DisplayName("The onField method returns the correct description of player with shirt number 9")
    public void test_left_wing() {
        assertEquals("left wing", FootballMatchReports.onField(9));
    }
    @Test
    @Tag("task:1")
    @DisplayName("The onField method returns the correct description of player with shirt number 10")
    public void test_striker() {
        assertEquals("striker", FootballMatchReports.onField(10));
    }
    @Test
    @Tag("task:1")
    @DisplayName("The onField method returns the correct description of player with shirt number 11")
    public void test_right_wing() {
        assertEquals("right wing", FootballMatchReports.onField(11));
    }
    @Test
    @Tag("task:2")
    @DisplayName("The onField method throws IllegalArgumentException for unknown shirt number")
    public void test_exception() {
        assertThrows(IllegalArgumentException.class, () -> FootballMatchReports.onField(13));
    }
}