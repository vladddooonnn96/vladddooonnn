package com.company.lesson10.clothesshop;

public class Tie extends Clothes implements ManClothes{

    public Tie(double cost, Sizes size, String color) {
        super(cost, size, color);
    }

    @Override
    public void toDressMan() {
        System.out.println("Галстук");
    }
}
