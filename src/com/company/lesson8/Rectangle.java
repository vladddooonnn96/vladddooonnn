package com.company.lesson8;

public class Rectangle extends Shape {
    private int a, b;

    public Rectangle(String color, int a, int b) {
        super(color);
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void draw() {
        System.out.println("Рисую прямоугольник " + getColor() + " цвета!");
    }
}
