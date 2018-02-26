package com.company.lesson8.vehicles;

import com.company.lesson8.professions.Driver;
import com.company.lesson8.details.Engine;
import com.company.lesson8.vehicles.Car;

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