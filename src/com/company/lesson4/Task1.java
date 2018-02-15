package com.company.lesson4;
/**
 * Задание 1
 * Создать программу, которая будет выводить на экран меньшее по модулю из трёх введённых пользователем вещественных чисел.
 * Для вычисления модуля используйте тернарную условную операцию.
 */

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner f = new Scanner(System.in);
        System.out.print("Введите число: ");
        int i = f.nextInt();
        System.out.print("Введите число: ");
        int b = f.nextInt();
        System.out.print("Введите число: ");
        int c = f.nextInt();
        int k, l, m;
        k = i < 0 ? -i : i;
        l = b < 0 ? -b : b;
        m = c < 0 ? -c : c;
        System.out.println("Минимальное это " + min(k, l, m));
    }

    static int min(int g, int v, int z) {
        if (g < v && g < z) return g;
        else if (v < g && v < z) return v;
        else if (z < g && z < v) return z;
        else return g;
    }

}