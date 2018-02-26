package com.company.lesson5;

/**
 * Задание5
 * Распечатать 10 строк: “Task1”. “Task2”. … “Task10”. Используем цикл while.
 */
public class Task5 {
    public static void main(String[] args) {
        String a = "Task ";
        int b = 0;
        while (b < 10) {
            System.out.println(a + ++b);
        }
    }
}