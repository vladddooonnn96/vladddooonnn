package com.company.lesson8.FruitShop;

public class Apple extends Fruit {
private double cost;

    public Apple(double weight, double cost) {
        super(weight);
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double costFruits() {
        return (getWeight() * getCost());
    }
}
