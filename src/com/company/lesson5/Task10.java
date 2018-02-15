package com.company.lesson5;

/*
Задание10
Создать массив типа String с размером 7. Записать в него значения дней недели.
Вывести на консоль значение последнего элемента.
 */
public class Task10 {
    public static void main(String[] args) {
        String[] days = new String[7];
        days[0] = "Sunday";
        days[1] = "Monday";
        days[2] = "Tue";
        days[3] = "Wenesd";
        days[4] = "Thur";
        days[5] = "Friday";
        days[6] = "Saturd";
        System.out.println(days[6]);

    }
}
