package com.company.lesson10.clothesshop;

public class Skirt extends Clothes implements WomenClothes {
    public Skirt(double cost, Sizes size, String color) {
        super(cost, size, color);
    }

    public void toDressWoman() {
        System.out.println("Юбка!");

    }
}
