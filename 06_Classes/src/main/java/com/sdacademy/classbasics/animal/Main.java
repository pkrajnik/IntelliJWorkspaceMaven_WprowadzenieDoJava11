package com.sdacademy.classbasics.animal;

public class Main {

    public static void main(String[] args) {

        Animal[] animals = {
                new Animal("Horse", "Jacek", 11),
                new Animal("Crocodile", "Adam", 2),
                new Animal("Shark", "Jan", 3),
                new Animal("Horse", "Dionizy", 5),
                new Animal("Cat", "Eryk", 7)
        };

        for (Animal animal : animals) {
            System.out.print(animal.getKind() + " " + animal.getName());
            if (animal.isDangerous()) {
                System.out.println(" is dangerous animal! Better be careful when playing with it!");
            } else {
                System.out.println(" is not dangerous animal, you may play with it.");
            }
        }
    }
}
