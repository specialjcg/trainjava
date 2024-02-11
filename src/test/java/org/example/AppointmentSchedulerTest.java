package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class AppointmentSchedulerTest {
    @Test
    @Tag("task:1")
    @DisplayName("Scheduling a date")
    public void testSchedule() {
        AppointmentScheduler scheduler = new AppointmentScheduler();

        var description = "07/25/2019 13:45:00";
        var expected = LocalDateTime.of(2019, 7, 25, 13, 45, 0);
        assertEquals(expected, scheduler.schedule(description));
    }
    @Test
    @Tag("task:2")
    @DisplayName("Appointment hours from now has not passed")
    public void testHasPassedHoursFromNow() {
        AppointmentScheduler scheduler = new AppointmentScheduler();

        var hoursFromNow = LocalDateTime.now().plusHours(3);
        assertFalse(scheduler.hasPassed(hoursFromNow));
    }
    @Test
    @Tag("task:3")
    @DisplayName("Noon appointment is an afternoon appointment")
    public void testIsAfternoonAppointmentForNoonAppointment() {
        AppointmentScheduler scheduler = new AppointmentScheduler();
        var appointment = LocalDateTime.of(2019, 8, 9, 12, 0, 0);
        assertTrue(scheduler.isAfternoonAppointment(appointment));
    }
}