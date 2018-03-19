package com.company.lesson10.clothesshop;


public class Atelier implements WomenClothes, ManClothes {

    public void toDressMan(Clothes... clothes) {
        for (Clothes c : clothes) {
            if (c instanceof ManClothes) {
                ((ManClothes) c).toDressMan();
            }
        }
    }

    public void toDressWoman(Clothes... clothes) {
        for (Clothes c : clothes) {
            if (c instanceof WomenClothes) {
                ((WomenClothes) c).toDressWoman();
            }
        }
    }

    @Override
    public void toDressMan() {


    }

    @Override
    public void toDressWoman() {

    }
}
