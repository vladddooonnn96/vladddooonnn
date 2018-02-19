package com.company.lesson7;

/**
 * Создать класс Person, который содержит:
 * a) поля fullName, age.
 * б) методы move() и talk(), в которых просто вывести на консоль сообщение -"Такой-то  Person говорит".
 * в) Добавьте два конструктора  - Person() и Person(fullName, age).
 * Создайте два объекта этого класса.
 * Один объект инициализируется конструктором Person(), другой - Person(fullName, age).
 */
public class Task2 {
    public static void main(String[] args) {
        Person person1 = new Person("Lexa", 17);
        Person person2 = new Person();
        System.out.println("Возраст: " + person1.age + " Имя: " + person1.fullName);
        System.out.println("Возраст: " + person2.age + " Имя: " + person2.fullName);
        person1.talk("Serega");
        person2.move("Stepa");
    }
}