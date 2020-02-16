package com.sdacademy.polymorphism.animal;

public abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void talk();
    public abstract void move();

    public String getName() {
        return name;
    }
}
