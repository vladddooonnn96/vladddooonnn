package com.company.lesson7.Animals;

public class AnimalDemo {
    public static void main(String[] args) {
        Vet vet = new Vet();
        Animal cat1 = new Cat("Рыба","Харьков","Люся");
        Animal dog1 = new Dog("Мясо","Берлин","Немецкая овчарка");
        Animal horse1 = new Horse("Сено","Париж","Белая");
    Animal [] animals = {cat1,dog1,horse1};
    for (Animal a : animals){
        vet.treatAnimal(a);
    }
    }
}
