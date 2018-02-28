package com.company.lesson7;

public class Phone {
    private static int count;
    private String number;
    private String model;
    private double weight;

    Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    Phone(String number, String model) {
        this.number = number;
        this.model = model;
        count++;
    }

    Phone() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    void reciveCall(String name) {
        System.out.println("Звонит " + name);
    }

    void reciveCall(String name, String number) {
        System.out.println("Звонит " + name + "с номером телефона " + number);
    }

    String hiNumber() {
        return number;
    }

    void sendMessage(String... numbers) {
        System.out.print("Сообщение отправленно ");
        for (String number : numbers) {
            System.out.print(number + ".");
        }
    }
}

