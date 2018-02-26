package com.company.lesson5;
/**
 * Задание2
 * С помощью класса Scanner ввести целое число.
 * Если это число от 0 до 10, вывести на консоль сообщение “Положительное число меньше 10”,
 * иначе вывести сообщение “Положительное число больше 10 или отрицательное”.
 * Используем оператор if-else.
 */

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        if (scanner.hasNextInt()) {
            int i = scanner.nextInt();
            if (i > 0 && i < 10) {
                System.out.print("Положительное число меньше 10!");
            } else {
                System.out.print("Положительное число больше 10 или отрицательное!");
            }
        } else {
            System.out.print("Вы ввели не целое число!");
        }
    }
}