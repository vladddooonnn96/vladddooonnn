package com.company.lesson4;

/*
Задание3
Вычислить среднее значение трех вещественных чисел передаваемых на вход программы в качестве аргументов.
Для преобразования из String в double используйте метод Double.parseDouble(String s).
 */
public class Task3 {
    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        double d = (a + b + c) / 3;
        System.out.println(d);
    }
}
