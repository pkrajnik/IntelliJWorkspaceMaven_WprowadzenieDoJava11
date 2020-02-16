package com.sdacademy.polymorphism.animal;

public class Cow extends Animal {

    public Cow(String name) {
        super(name);
    }

    @Override
    public void talk() {
        System.out.println("Muuu!");
    }

    @Override
    public void move() {
        System.out.println("Krowa idzie!");
    }
}
