package com.company.lesson5;

/**
 * Задание1
 * Передать на вход программы число в качестве аргумента. Если оно нечетное, распечатать его.
 * Используем оператор if. Используйте метод Integer.parseInt() для преобразования из String в int.
 */
public class Task1 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        if (a % 2 != 0) {
            System.out.println(args[0]);
        } else {
            System.out.println("Число четное!");
        }
    }
}