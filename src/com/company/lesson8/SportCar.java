package com.company.lesson8;

public class SportCar extends Car {
    double speed;

    public SportCar(String model, String carClass, int weight, Driver driver, Engine engine, double speed) {
        super(model, carClass, weight, driver, engine);
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}