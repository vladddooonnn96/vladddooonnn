package com.company.lesson10.clothesshop;

public class Tshirt extends Clothes implements WomenClothes,ManClothes {
    public Tshirt(double cost, Sizes size, String color) {
        super(cost, size, color);
    }

    @Override
    public void toDressWoman() {
        System.out.println("Футболка");
    }

    @Override
    public void toDressMan() {
        System.out.println("Футболка");
    }
}
