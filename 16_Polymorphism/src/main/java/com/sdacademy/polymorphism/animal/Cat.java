package com.sdacademy.polymorphism.animal;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void talk() {
        System.out.println("Miau!");
    }

    @Override
    public void move() {
        System.out.println("Kot się skrada!");
    }
}
