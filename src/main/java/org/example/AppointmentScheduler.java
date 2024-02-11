package org.example;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy HH:mm:ss");
        return LocalDateTime.parse(appointmentDateDescription, formatter);    }

    public boolean hasPassed(LocalDateTime appointmentDateTime) {
        LocalDateTime currentDateTime = LocalDateTime.now();
        return currentDateTime.isAfter(appointmentDateTime);
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        throw new UnsupportedOperationException("Please implement the AppointmentScheduler.isAfternoonAppointment() method");
    }

    public String getDescription(LocalDateTime appointmentDate) {
        throw new UnsupportedOperationException("Please implement the AppointmentScheduler.getDescription() method");
    }

    public LocalDate getAnniversaryDate() {
        throw new UnsupportedOperationException("Please implement the AppointmentScheduler.getAnniversaryDate() method");
    }
}
