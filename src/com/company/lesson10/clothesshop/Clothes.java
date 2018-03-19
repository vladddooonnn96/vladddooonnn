package com.company.lesson10.clothesshop;

import java.util.Objects;

public abstract class Clothes {
    private double cost;
    private Sizes size;
    private String color;

    public Clothes(double cost, Sizes size, String color) {
        this.cost = cost;
        this.size = size;
        this.color = color;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Sizes getSize() {
        return size;
    }

    public void setSize(Sizes size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clothes clothes = (Clothes) o;
        return Double.compare(clothes.cost, cost) == 0 &&
                size == clothes.size &&
                Objects.equals(color, clothes.color);
    }

    @Override
    public int hashCode() {

        return Objects.hash(cost, size, color);
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "cost=" + cost +
                ", size=" + size +
                ", color='" + color + '\'' +
                '}';
    }
}
