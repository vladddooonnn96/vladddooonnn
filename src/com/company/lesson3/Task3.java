package com.company.lesson3;
/**
 * Задание 3
 * Создать программу, которая будет сообщать, является ли целое число, введённое пользователем, чётным или нечётным.
 * Если пользователь введёт не целое число, то сообщать ему об ошибке.
 */

import java.util.Scanner;

public class Task3 {
    public static void main(String args[]) {
        Scanner l = new Scanner(System.in);
        System.out.print("Введите число: ");
        int i = l.nextInt();
        System.out.print("Число " + i + " ");
        if (i % 2 == 0) {
            System.out.println("четное");
        } else {
            System.out.println("нечетное");
        }
    }
}

