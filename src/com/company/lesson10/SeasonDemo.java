package com.company.lesson10;

public class SeasonDemo {
    public static void main(String[] args) {
        Season season = Season.SUMMER;
        Season season2;
        System.out.println(season);
        print(season);
        print();
        printFavorite();
    }

    public static void print(Season season) {
        switch (season) {
            case WINTER:
                System.out.println("I like winter!");
                break;
            case AUTUMN:
                System.out.println("I like autumn!");
                break;
            case SUMMER:
                System.out.println("I like summer!");
                break;
            case SPRING:
                System.out.println("Iike spring!");
                break;
        }
    }

    public static void print() {
        Season[] lalala = Season.values();
        for (Season s : lalala) {
            System.out.print(s + " " + s.getAvgTemperature()+ " ");
            System.out.println(s.getDescription());
        }
    }

    public static Season printFavorite() {
        //  Season season1;
        Season season1 = Season.valueOf("SUMMER");
        System.out.println("");
        return season1;

    }
}
