package com.company.lesson7.Animals;

public class Cat extends Animal {
    private String name;

    public Cat(String food, String location, String name) {
        super(food, location);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void makeNoize() {
        System.out.println("Кот мурчит!");
    }

    public void eat() {
        System.out.println("Кот ест!");
    }
}
