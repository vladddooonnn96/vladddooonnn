package com.company.lesson10.clothesshop;

public class Trousers extends Clothes implements WomenClothes,ManClothes {
    public Trousers(double cost, Sizes size, String color) {
        super(cost, size, color);
    }

    @Override
    public void toDressMan() {
        System.out.println("Брюки");
    }

    @Override
    public void toDressWoman() {
        System.out.println("Брюки");
    }
}
