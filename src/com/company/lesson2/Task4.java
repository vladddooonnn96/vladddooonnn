package com.company.lesson2;

/**
 * Задание 4
 * Создать программу, в которой вывести на консоль литералы следующих видов:
 * а) логический литерал
 * б) строковый
 * в) символьный
 * г) целочисленный 2-й
 * д) целочисленный 8-й
 * е) целочисленный 10-й
 * ж) целочисленный 16-й
 * з) литерал типа float
 * е) литерал типа double.
 */
public class Task4 {
    public static void main(String[] args) {
        //Задание 4
        System.out.println("Логический литерал: " + true);
        System.out.println("Символьный юникод литерал : " + '\u262D');
        System.out.println("Строковый литерал: " + "\"Hello\"");
        System.out.println("Двоичный литерал литерал: " + 0b010);
        System.out.println("Воьмеричный литерал: " + 010);
        System.out.println("Шестнадцатеричный литерал: " + 0xdffff);
        System.out.println("Литерал типа float: " + 2.967f);
        System.out.println("Литерал типа double: " + 2.967);
        //Задание 5
        int y = 7;
        int z = 12;
        int x;
        x = sum(y, z);
        System.out.println("Сумма равна = " + x);
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}
