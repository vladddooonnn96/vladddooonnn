package com.company.lesson5;

/**
 * Задание12
 * Создать массив типа String размером 3х6. И записать в него значения:
 * a1  a2  a3  a4  a5  a6
 * b1  b2  b3  b4  b5  b6
 * c1  c2   c3  c4  c5  c6
 */
public class Task12 {
    public static void main(String[] args) {
        char c = 'a';
        String[][] array = new String[3][6];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                array[i][j] = c + "" + (j + 1);
                System.out.print(array[i][j] + " ");
            }
            c++;
            System.out.println();
        }


    }
}