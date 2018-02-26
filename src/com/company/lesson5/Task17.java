package com.company.lesson5;

        import java.util.Arrays;

public class Task17 {
    public static void main(String[] args) {
        int[][] array = {
                {0, 1, 2, 3, 76, 54, 63, 7},
                {4, 5, 6, 7, 77, 65, 78, 9},
                {8, 9, 10, 11, 55, 67, 8, 9},
                {12, 13, 14, 15, 7, 8, 5, 4},
                {27, 7, 6, 8, 5, 9, 11, 7}
        };
        for (int[] arr : array) {
            Task16.sort(arr);
            System.out.println(Arrays.toString(arr));
        }
        int[][] array2 = {
                {0, 0},
                {0, 0},
                {0, 0},
                {0, 0},
                {0, 0}
        };
        int k=0;
        for (int[] arr2 : array) {
            System.arraycopy(arr2, 0, array2[k++], 0, 1);
            //  System.out.println(Arrays.toString(arr2));
        }
        System.out.println(Arrays.deepToString(array2));
    }
}
