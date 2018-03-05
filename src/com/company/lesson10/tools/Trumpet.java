package com.company.lesson10.tools;

import java.util.Objects;

public class Trumpet implements Tool {
    private double diametr;

    public Trumpet(double diametr) {
        this.diametr = diametr;
    }

    public double getDiametr() {
        return diametr;
    }

    public void setDiametr(double diametr) {
        this.diametr = diametr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trumpet trumpet = (Trumpet) o;
        return Double.compare(trumpet.diametr, diametr) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(diametr);
    }

    @Override
    public String toString() {
        return "Trumpet{" +
                "diametr=" + diametr +
                '}';
    }
    public void play(){
        System.out.println("Играет труба с такими характеристиками: " + diametr);
    }
}
