package com.company.lesson7.Flowers;

public class Flower {
    private String countryManufacturer;
    private int cost, shelfLife;
    private static int count;


    public Flower(String countryManufacturer, int cost, int shelfLife) {
        this.countryManufacturer = countryManufacturer;
        this.cost = cost;
        this.shelfLife = shelfLife;
        this.count = count;
        count++;
    }

    public String getCountryManufacturer() {
        return countryManufacturer;
    }

    public void setCountryManufacturer(String countryManufacturer) {
        this.countryManufacturer = countryManufacturer;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(int shelfLife) {
        this.shelfLife = shelfLife;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Flower.count = count;
    }
    public static double cost(Flower... flowers){
        double result = 0;
        for(Flower f : flowers){
         result+=f.getCost();
        }
        return result;
    }
}
