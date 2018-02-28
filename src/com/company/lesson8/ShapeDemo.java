package com.company.lesson8;


public class ShapeDemo {
    public static void main(String[] args) {
        Circle circle = new Circle("красного", 77, 99, 99);
        Rectangle rectangle = new Rectangle("синего", 55, 66);
        Shape[] figures = {circle, rectangle};
        for (Shape a : figures) {
            a.draw();
        }
    }
}