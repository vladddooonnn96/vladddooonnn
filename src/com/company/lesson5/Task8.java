package com.company.lesson5;
/**
 * Задание 8
 * Переписать гирлянду используя оператор switch для  выбора  нужной операции.
 */

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int g = 32;
        System.out.print("Введите номер операции(от 1 до 4): ");
        int operation = s.nextInt();
        switch (operation) {
            case 1:
                int l = ~g;
                System.out.println("Мигание лампочками: " + Integer.toBinaryString(l));
                break;
            case 2:
                int m = g >> 1;
                System.out.println("Режим бегущей строки: " + Integer.toBinaryString(m));
                break;
            case 3:
                System.out.print("Определение лампочки на первой позиции: ");
                int c = g & 1;
                if (c == 1) {
                    System.out.println("Лампочка включенна");
                } else {
                    System.out.println("Лампочка выключенна");
                }
                break;
            case 4:
                System.out.printf("Определение текущего состояния гирлянды: " + Integer.toBinaryString(g));
                break;
            default:
                System.out.println("Операция не найдена");
        }
    }
}
