package com.sdacademy.polymorphism.animal;

public class Alligator extends Animal {

    public Alligator(String name) {
        super(name);
    }

    @Override
    public void talk() {
        System.out.println("Warg!");
    }

    @Override
    public void move() {
        System.out.println("Krokodyl idzie!");
    }

    public void jawSnap(){
        System.out.println("Klap!");
    }

}
