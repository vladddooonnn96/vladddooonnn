package com.company.lesson2;

/**
 * Задание 5
 * Создать метод принимающий на вход две переменные типа int.
 * Метод вычисляет их сумму и возвращает значение. Вызвать этот метод из метода main.
 */
public class Task5 {
    public static void main(String[] args) {
        int y = 7;
        int z = 12;
        int x;
        x = sum(y, z);
        System.out.println("Сумма равна = " + x);
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}