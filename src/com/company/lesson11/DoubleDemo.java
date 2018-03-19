package com.company.lesson11;

public class DoubleDemo {
    public static void main(String[] args) {
        Double double1 = 2.4;
        Double double2 = new Double("2.4");
        Double d1 = 5.2;
        Double d2 = Double.valueOf("5.2");
        double d3 = Double.parseDouble("6.77");
        System.out.println(double1 + " " + double2);
        System.out.println(d1 + " " + d2 + " " + d3);
    }
}
