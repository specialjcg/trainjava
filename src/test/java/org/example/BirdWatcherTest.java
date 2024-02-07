package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BirdWatcherTest {
    private BirdWatcher birdWatcher;
    int[] lastWeek;

    @BeforeEach
    public void setUp() {

        lastWeek = new int[]{0, 2, 5, 3, 7, 8, 4};

        birdWatcher = new BirdWatcher(lastWeek);
    }
    @Test
    @Tag("task:1")
    @DisplayName("The getLastWeek method correctly returns last week's counts")
    public void itTestGetLastWeek() {

        assertArrayEquals(lastWeek, birdWatcher.getLastWeek());
    }
    @Test
    @Tag("task:2")
    @DisplayName("The getToday method correctly returns today's counts")
    public void itTestGetToday() {
        assertEquals(4, birdWatcher.getToday());
    }
    @Test
    @Tag("task:3")
    @DisplayName("The incrementTodaysCount method correctly increments today's counts")
    public void itIncrementTodaysCount() {
        birdWatcher.incrementTodaysCount();
        assertEquals(5, birdWatcher.getToday());
    }
    @Test
    @Tag("task:4")
    @DisplayName("The hasDayWithoutBirds method returns false when no day had zero visits")
    public void itShouldNotHaveDaysWithoutBirds() {
        birdWatcher = new BirdWatcher(new int[] { 1, 2, 5, 3, 7, 8, 4 });
        assertFalse(birdWatcher.hasDayWithoutBirds());

    }

    @Test
    @Tag("task:4")
    @DisplayName("The hasDayWithoutBirds method returns true when day had no visits")
    public void itHasDayWithoutBirds() {
        assertTrue(birdWatcher.hasDayWithoutBirds());
    }
    @Test
    @Tag("task:5")
    @DisplayName("The getCountForFirstDays method returns correct visits' count for given number of days")
    public void itTestGetCountForFirstDays() {
        assertEquals(10, birdWatcher.getCountForFirstDays(4));
    }
    @Test
    @Tag("task:6")
    @DisplayName("The getBusyDays method correctly returns zero in case of no busy days")
    public void itShouldNotHaveBusyDays() {
        birdWatcher = new BirdWatcher(new int[] { 1, 2, 3, 3, 2, 1, 4 });
        assertEquals(0, birdWatcher.getBusyDays());
    }
    @Test
    @Tag("task:6")
    @DisplayName("The getBusyDays method returns the correct count of busy days")
    public void itTestGetCountForBusyDays() {
        // DAY3, DAY5 and DAY6 are all >= 5 birds
        assertEquals(birdWatcher.getBusyDays(), 3);
    }
}