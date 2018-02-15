package com.company.lesson5;

/**
 * Задание 9
 * Реализовать подсчет факториала используя цикл for.
 * Число n задается случайным образом (используйте Math.random()).
 */
public class Task9 {
    public static void main(String[] args) {
        int n = getRandomValue(3);
        int b = 1;
        for (int i = 1; i <= n; ++i)
            b = b * i;
        System.out.println(b);
    }
    public static int getRandomValue(int u){
        return (int)(Math.random()*u+1);
    }
}
