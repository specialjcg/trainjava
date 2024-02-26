package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NeedForSpeedTest {
    @Test
    @Tag("task:3")
    @DisplayName("The distanceDriven method returns 0 on a new car")
    public void new_remote_control_car_has_not_driven_any_distance() {
        int speed = 10;
        int batteryDrain = 2;
        var car = new NeedForSpeed(speed, batteryDrain);
        assertEquals(0, car.distanceDriven());
    }
    @Test
    @Tag("task:3")
    @DisplayName("The distanceDriven method returns 5 after driving once")
    public void drive_increases_distance_driven_with_speed() {
        int speed = 5;
        int batteryDrain = 1;
        var car = new NeedForSpeed(speed, batteryDrain);
        car.drive();
        assertEquals(5, car.distanceDriven());

    }
    @Test
    @Tag("task:3")
    @DisplayName("The distanceDriven method returns the correct distance after driving multiple times")
    public void drive_does_not_increase_distance_driven_when_battery_drained() {
        int speed = 9;
        int batteryDrain = 50;
        var car = new NeedForSpeed(speed, batteryDrain);
        // Drain the battery
        car.drive();
        car.drive();
        // One extra drive attempt (should not succeed)
        car.drive();
        assertEquals(car.distanceDriven(), 18);
    }
    @Test
    @Tag("task:5")
    @DisplayName("The distanceDriven method returns 0 on a new nitro car")
    public void nitro_car_has_not_driven_any_distance() {
        var car = NeedForSpeed.nitro();
        assertEquals(0, car.distanceDriven());
    }

    @Test
    @Tag("task:6")
    @DisplayName("The tryFinishCar method returns true when car can finish a race")
    public void car_can_finish_with_car_that_can_easily_finish() {
        int speed = 10;
        int batteryDrain = 2;
        var car = new NeedForSpeed(speed, batteryDrain);
        int distance = 100;
        var race = new RaceTrack(distance);
        assertTrue(race.tryFinishTrack(car));
    }
    @Test
    @Tag("task:6")
    @DisplayName("The tryFinishCar method returns true when car can just finish a race")
    public void car_can_finish_with_car_that_can_just_finish() {
        int speed = 2;
        int batteryDrain = 10;
        var car = new NeedForSpeed(speed, batteryDrain);
        int distance = 20;
        var race = new RaceTrack(distance);
        assertTrue(race.tryFinishTrack(car));
    }
}