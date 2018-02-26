package com.company.lesson5;

/**
 * Задание4
 * Переписать задание 3 используя switch.
 */
public class Task4 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        String day;
        switch (a) {
            case 1:
                day = "Monday";
                System.out.println(day);
                break;
            case 2:
                day = "Tuesday";
                System.out.println(day);
                break;
            case 3:
                day = "Wednesday";
                System.out.println(day);
                break;
            case 4:
                day = "Thursday";
                System.out.println(day);
                break;
            case 5:
                day = "Friday";
                System.out.println(day);
                break;
            case 6:
            case 7:
                day = "Weekend";
                System.out.println(day);
                break;
            default:
                day = "Incorrect number!";
                System.out.println(day);

        }
    }
}