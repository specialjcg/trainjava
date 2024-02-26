package org.example;

public class NeedForSpeed {
    private int speed;
    private int batteryDrain;
    private int battery=100;
    private int distance=0;
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;

    }

    public boolean batteryDrained() {
        return this.battery<=0;
    }

    public int distanceDriven() {

        return this.distance;
    }

    public void drive() {
        if (this.batteryDrained()) return;
        this.distance+=this.speed;
        this.battery-=this.batteryDrain;

    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    private final int distance;

    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean tryFinishTrack(NeedForSpeed car) {

        if (car.batteryDrained()) return this.distance<=car.distanceDriven();
        car.drive();
        tryFinishTrack(car);
        return this.distance<=car.distanceDriven();
    }
}
