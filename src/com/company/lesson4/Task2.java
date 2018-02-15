package com.company.lesson4;
/**
 * Задание 2
 * Имеется гирлянда, состоящая из 32 лампочек. Каждая лампочка имеет два состояния - включена или выключена.
 * В начале работы программы случайным образом задайте какие лампочки будут включены. Напишите следующие методы:
 a) метод который будет мигать лампочками гирлянды заданное количество раз (операция ~);
 б) метод, который будет запускать гирлянду в режим бегущей строки (операция << или >>);
 в) метод, который будет выяснять включена ли лампочки на первой позиции (наложение маски с помощью &);
 г) метод который будет распечатывать текущее состояние гирлянды.
 */
public class Task2 {
    public static void main(String[] args) {
        int g = 32;
        Blink(g);
        RunningString(g);
        CurrentState(g);
        Mask(g);
    }

    static void Blink(int g) {
        int t = ~g;
        CurrentState(t);
    }

    static void RunningString(int g) {
        int y = g >> 1;
        CurrentState(y);
    }

    static void Mask(int g) {
        int c = g & 1;
        if (c == 1) {
            System.out.println("Лампочка включенна");
        } else {
            System.out.println("Лампочка выключенна");
        }

    }

    static void CurrentState(int g) {
        System.out.printf("%32s\n", Integer.toBinaryString(g));
    }
}
