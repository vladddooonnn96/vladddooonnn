package com.company.lesson8.vehicles;

import com.company.lesson8.professions.Driver;
import com.company.lesson8.details.Engine;
import com.company.lesson8.vehicles.Car;

public class Lorry extends Car {
    private int carrying;

    public Lorry(String model, String carClass, int weight, Driver driver, Engine engine, int carrying) {
        super(model, carClass, weight, driver, engine);
        this.carrying = carrying;
    }

    public int getCarrying() {
        return carrying;
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }
}