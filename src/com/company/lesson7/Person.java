package com.company.lesson7;

public class Person {
    String fullName = "Vlad";
    int age = 21;

    Person() {
    }

    Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    void talk(String name) {
        System.out.println("Говорит " + name);
    }

    void move(String name) {
        System.out.println("Двигается " + name);
    }
}