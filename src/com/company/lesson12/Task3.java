package com.company.lesson12;

public class Task3 {
    public static void main(String[] args) {
        String s = "object oriented programming is really hard";
        Replacement(s);
    }

    private static void Replacement(String o) {
        System.out.println(o.replace("object oriented programming", "OOP"));
    }
}