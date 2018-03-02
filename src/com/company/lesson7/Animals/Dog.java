package com.company.lesson7.Animals;

public class Dog extends Animal {
    private String breed;

    public Dog(String food, String location, String breed) {
        super(food, location);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void makeNoize() {
        System.out.println("Собака лает!");
    }

    public void eat() {
        System.out.println("Собака ест!");
    }
}
