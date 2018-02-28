package com.company.lesson8;

public class Circle extends Shape {
    private int radius, x, y;

    public Circle(String color, int radius, int x, int y) {
        super(color);
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void draw() {
        System.out.println("Рисую круг " + getColor() + " цвета!");
    }
}
