package com.company.lesson8.СircleComtuting;

public class SecondCircleDemo {
    public static void main(String[] args) {
        SecondCicrle circle1 = new SecondCicrle(2.5);
        SecondCicrle circle2 = new SecondCicrle(6.7);
        SecondCicrle circle3 = new SecondCicrle(5.8);
        SecondCicrle circle4 = new SecondCicrle(6.8);
        System.out.println("Площадь круга равна " + circle1.area());
        System.out.println("Площадь круга равна " + circle2.area());
        System.out.println("Площадь круга равна " + circle3.area());
        System.out.println("Площадь круга равна " + circle4.area());
        System.out.println("Длинна окружности равна " + circle1.lengthCircle());
        System.out.println("Длинна окружности равна " + circle2.lengthCircle());
        System.out.println("Длинна окружности равна " + circle3.lengthCircle());
        System.out.println("Длинна окружности равна " + circle4.lengthCircle());
    }
}
