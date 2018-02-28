package com.company.lesson7;

/*
Задание1
Класс Phone.
a) Создайте класс Phone, который содержит переменные number, model и weight.
б) Создайте три экземпляра этого класса.
в) Выведите на консоль значения их переменных.
г) Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего. Выводит на консоль сообщение “Звонит {name}”. getNumber – возвращает номер телефона. Вызвать эти методы для каждого из объектов.
д) Добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации переменных класса - number, model и weight.
е) Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса - number, model.
ж) Добавить конструктор без параметров.
з) Вызвать из конструктора с тремя параметрами конструктор с двумя.
и) Добавьте перегруженный метод receiveCall, который принимает два параметра - имя звонящего и номер телефона звонящего. Вызвать этот метод.
к) Создать метод sendMessage  с аргументами переменной длины. Данный метод принимает на вход номера телефонов, которым будет отправлено сообщение. Метод выводит на консоль номера этих телефонов.
 */
public class Task1 {
    public static void main(String[] args) {
        Phone phone1 = new Phone("", "LLP", 544);
        Phone phone2 = new Phone("6786", "ggwp");
        Phone phone3 = new Phone();

        System.out.println("Кол-во телефонов: " + Phone.getCount());
        System.out.println(" номер " + phone1.getNumber() + " модель " + phone1.getModel() + " вес " + phone1.getWeight());
        System.out.println(" номер " + phone2.getNumber() + " модель " + phone2.getModel() + " вес " + phone2.getWeight());
        System.out.println(" номер " + phone3.getNumber() + " модель " + phone3.getModel() + " вес " + phone3.getWeight());

        phone1.reciveCall("Friend");
        phone1.reciveCall("Friend", "879568459");
        System.out.println(phone1.hiNumber());
        phone1.sendMessage("0889989484", "0889795", "87958493");
    }
}
