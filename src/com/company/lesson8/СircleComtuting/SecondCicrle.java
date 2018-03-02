package com.company.lesson8.СircleComtuting;

public class SecondCicrle {
    private double radius;
    private final double pi=3.14;

    public SecondCicrle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPi() {
        return pi;
    }
    public double area(){
        return (getRadius()*getRadius())*pi;
    }
    public double lengthCircle(){
        return 2 * pi * getRadius();
    }
}
