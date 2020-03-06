package com.sdacademy.innerclasses.anonymous;

interface Animal {
    void eat();
}

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal() {
            @Override
            public void eat() {
                System.out.println("Animal is eating meat.");
            }
        };

        animal.eat();
    }
}
