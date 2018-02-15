package com.company.lesson3;
/**
 * Задание4
 * Создать программу, которая будет вычислять и выводить на экран сумму двух целых чисел, введённых пользователем.
 * Если пользователь некорректно введёт хотя бы одно из чисел, то сообщать об ошибке.
 */

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int i = secondOp(k);
        int y = secondOp(k);
        System.out.println(i + y);
    }

    static int secondOp(Scanner k) {
        System.out.print("Введите целое число: ");
        if (k.hasNextInt()) {
            int i = k.nextInt();
            return i;
        } else {
            System.out.println("Вы ввели не целое число");
            System.exit(1);
            return 0;
        }
    }
}

