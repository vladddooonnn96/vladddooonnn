package com.company.lesson10.clothesshop;

public class AtelierDemo {
    public static void main(String[] args) {


        Tie tie1 = new Tie(56, Sizes.S, "Red");
        Tie tie2 = new Tie(75, Sizes.L, "Blue");
        Tie tie3 = new Tie(74, Sizes.XXS, "Brown");
        Skirt skirt1 = new Skirt(886, Sizes.M, "Green");
        Skirt skirt2 = new Skirt(754, Sizes.XXS, "Pink");
        Skirt skirt3 = new Skirt(675, Sizes.XXS, "Black");
        Trousers trousers1 = new Trousers(5464, Sizes.XXS, "Yellow");
        Trousers trousers2 = new Trousers(645, Sizes.XXS, "Orange");
        Trousers trousers3 = new Trousers(645, Sizes.XXS, "Gray");
        Tshirt tshirt1 = new Tshirt(645, Sizes.XXS, "White");
        Tshirt tshirt2 = new Tshirt(645, Sizes.XXS, "Violet");
        Tshirt tshirt3 = new Tshirt(464, Sizes.XXS, "Red");
        Clothes[] clothes1 = {tie1, tie2, tie3, trousers1, trousers2, trousers3, tshirt1, tshirt2, tshirt3, skirt1, skirt2, skirt3};
        Atelier atelier1 = new Atelier();
        for (Clothes c : clothes1){
            atelier1.toDressMan(c);
            atelier1.toDressWoman(c);
        }
    }
}
