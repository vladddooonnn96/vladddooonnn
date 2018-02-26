package com.company.lesson5;

/**
 * Задание7
 * Распечатать 5 символов в одну строку начиная с ‘h’. Используем цикл for.
 */
public class Task7 {
    public static void main(String[] args) {
        char a = 'h';
        for (int i = 0; i < 5; i++) {
            System.out.println(a++);
        }
    }
}