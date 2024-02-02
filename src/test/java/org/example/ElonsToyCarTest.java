package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElonsToyCarTest {
    @Test
    @Tag("task:1")
    @DisplayName("The static buy method returns a new remote controlled car instance")
    public void buy_new_car_returns_instance() {
        ElonsToyCar car = ElonsToyCar.buy();
        assertNotNull(car);
    }
    @Test
    @Tag("task:2")
    @DisplayName("The distanceDisplay method shows 0 meters message on a new car")
    public void new_car_distance_display() {
        ElonsToyCar car = new ElonsToyCar();
        assertEquals(car.distanceDisplay(),"Driven 0 meters");
    }
    @Test
    @Tag("task:3")
    @DisplayName("The batteryDisplay method shows full battery message on a new car")
    public void new_car_battery_display() {
        ElonsToyCar car = new ElonsToyCar();
        assertEquals(car.batteryDisplay(),"Battery at 100%");
    }
    @Test
    @Tag("task:4")
    @DisplayName("The distanceDisplay method shows the correct message after driving once")
    public void distance_display_after_driving_once() {
        ElonsToyCar car = new ElonsToyCar();
        car.drive();
        assertEquals(car.distanceDisplay(),"Driven 20 meters");
    }
    @Test
    @Tag("task:4")
    @DisplayName("The distanceDisplay method shows the correct message after driving multiple times")
    public void distance_display_after_driving_multiple_times() {
        ElonsToyCar car = new ElonsToyCar();
        for (int i = 0; i < 17; i++) {
            car.drive();
        }
        assertEquals(car.distanceDisplay(),"Driven 340 meters");
    }
    @Test
    @Tag("task:5")
    @DisplayName("The batteryDisplay method shows the correct message after driving once")
    public void battery_display_after_driving_once() {
        ElonsToyCar car = new ElonsToyCar();
        car.drive();
        assertEquals(car.batteryDisplay(),"Battery at 99%");
    }
    @Test
    @Tag("task:5")
    @DisplayName("The batteryDisplay method shows battery empty after draining all battery")
    public void battery_display_when_battery_empty() {
        ElonsToyCar car = new ElonsToyCar();
        // Drain the battery
        for (int i = 0; i < 100; i++) {
            car.drive();
        }
        // Attempt to drive one more time (should not work)
        car.drive();
        assertEquals(car.batteryDisplay(),"Battery empty");
    }
    @Test
    @Tag("task:5")
    @DisplayName("The batteryDisplay method shows the correct battery percentage after driving multiple times")
    public void battery_display_after_driving_multiple_times() {
        ElonsToyCar car = new ElonsToyCar();
        for (int i = 0; i < 23; i++) {
            car.drive();
        }
        assertEquals(car.batteryDisplay(),"Battery at 77%");
    }
    @Test
    @Tag("task:6")
    @DisplayName("The distanceDisplay method shows the correct message after driving and draining all battery")
    public void distance_display_when_battery_empty() {
        ElonsToyCar car = new ElonsToyCar();
        // Drain the battery
        for (int i = 0; i < 100; i++) {
            car.drive();
        }
        // Attempt to drive one more time (should not work)
        car.drive();
        assertEquals(car.distanceDisplay(),"Driven 2000 meters");
    }

}