package com.company.lesson5;

public class BubbleSorter {
    public static void sort(int[] array) {
        // i - номер прохода
        for (int i = 0; i < array.length; i++) {
            // внутренний цикл прохода
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }
}
