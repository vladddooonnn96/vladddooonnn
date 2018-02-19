package com.company.lesson5;
/**
 * Задание13
 * Создать двумерный массив типа char размером 4х2. И записать туда значения с помощью блока для инициализации.
 * Распечатать значения массива с помощью метода Arrays.deepToString(m).
 */

        import java.util.Arrays;

public class Task13 {
    public static void main(String[] args) {
        char[][] array = {
                {'a', 'b'},
                {'c', 'd'},
                {'e', 'f'},
                {'g', 'h'},
        };
        System.out.println(Arrays.deepToString(array));
    }
}