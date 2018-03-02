package com.company.lesson7.Flowers;

public class Bouquet {
    public static void main(String[] args) {
        Flower lily1 = new Lily("Украина", 78, 10);
        Flower hydrangea1 = new Hydrangea("Германия", 43, 5);
        Flower rose1 = new Rose("Франция", 24, 5);
        Flower rose2 = new Rose("Македония", 34, 45);
        Flower violet1 = new Violet("Австралия", 546, 45);
        System.out.println("Стоимость букета: " + (lily1.getCost() + rose1.getCost() + hydrangea1.getCost() + violet1.getCost() + rose2.getCost()));
        System.out.println("Проданно " + Flower.getCount() + " цветов!");
    }
}