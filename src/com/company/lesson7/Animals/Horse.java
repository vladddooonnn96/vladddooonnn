package com.company.lesson7.Animals;

public class Horse extends Animal {
    private String color;

    public Horse(String food, String location, String color) {
        super(food, location);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void makeNoize() {
        System.out.println("Лошадь шумит!");
    }

    public void eat() {
        System.out.println("Лошадь ест!");
    }
}
