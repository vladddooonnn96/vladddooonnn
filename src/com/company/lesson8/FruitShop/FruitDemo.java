package com.company.lesson8.FruitShop;

public class FruitDemo {
    public static void main(String[] args) {
        Fruit apple1 = new Apple(7.6, 6.7);
        Fruit apple2 = new Apple(6.5, 4.6);
        Fruit apple3 = new Apple(5.7, 3.8);
        Fruit pear1 = new Pear(9.5, 6.7);
        Fruit pear2 = new Pear(7.4, 5.9);
        Fruit pear3 = new Pear(10, 5.7);
        Fruit apricot1 = new Apricot(7.1, 6.7);
        Fruit apricot2 = new Apricot(3.6, 1.8);
        Fruit apricot3 = new Apricot(7.5, 4.3);
        Fruit[] fruits = {apple1, apple2, apple3, apricot1, apricot2, apricot3, pear1, pear2, pear3};
        double allCost = 0;
        for (Fruit f : fruits) {
            allCost += f.costFruits();
            System.out.println(allCost);
        }

    }

}
