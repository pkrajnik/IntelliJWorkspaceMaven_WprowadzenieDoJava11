package com.sdacademy.generics.example;

public class BoxForGenericFruits<T>{

    private T fruit;

    public BoxForGenericFruits(T fruit) {
        this.fruit = fruit;
    }

    public T getFruit() {
        return fruit;
    }

    public void setFruit(T fruit) {
        this.fruit = fruit;
    }
}
