package com.company.lesson7.Animals;

public class Vet {
    public void treatAnimal(Animal animal){
        System.out.println("Еда животного: " + animal.getFood() + ". Расположение животного: " + animal.getLocation() + ".");
    }
}
