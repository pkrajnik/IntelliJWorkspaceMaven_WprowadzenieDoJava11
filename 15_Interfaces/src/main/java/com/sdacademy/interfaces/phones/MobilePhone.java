package com.sdacademy.interfaces.phones;

public class MobilePhone implements Computer, Camera, Phone {
    @Override
    public void takePhoto() {
        System.out.println("Robie Zdjecie!");
    }

    @Override
    public void runApplication() {
        System.out.println("Uruchamiam aplikacje!");
    }

    @Override
    public void call() {
        System.out.println("Dzwonie pod numer...");
    }
}
