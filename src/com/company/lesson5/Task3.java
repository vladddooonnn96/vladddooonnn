package com.company.lesson5;

/**
 * Задание3
 * Передать на вход программы число От 1 до 7 в качестве аргумента.
 * Если число равно 1, выводим на консоль “Понедельник”, 2 –”Вторник” и т.д. Если 6 или 7 – “Выходной”.
 * Используем конструкцию if-else-if.
 */
public class Task3 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        if (a == 1) {
            System.out.println("Monday");
        } else if (a == 2) {
            System.out.println("Tuesday");
        } else if (a == 3) {
            System.out.println("Wednesday");
        } else if (a == 4) {
            System.out.println("Thursday");
        } else if (a == 5) {
            System.out.println("Friday");
        } else if (a == 6 || a == 7) {
            System.out.println("Weekend");
        } else {
            System.out.println("Incorrect number!");
        }
    }
}