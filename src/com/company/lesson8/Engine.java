package com.company.lesson8;

public class Engine {
    double power;
    String creator;

    public Engine() {
    }

    public Engine(double power, String creator) {
        this.power = power;
        this.creator = creator;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }
}