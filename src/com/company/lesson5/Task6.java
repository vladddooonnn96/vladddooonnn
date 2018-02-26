package com.company.lesson5;

/**
 * Задание6
 * Распечатать все числа от 1 до 100, которые делятся на 5 без остатка.
 */
public class Task6 {
    public static void main(String[] args) {
        int i = 1;
        do {
            i++;
            if (i % 5 == 0) {
                System.out.println(i++);
            }
        } while (i < 100);
    }
}