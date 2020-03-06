package com.sdacademy.generics.box;

public class Main {

    public static void main(String[] args) {
        Box<String,Integer,Double> box = new Box<>();

        box.putInBoxS(99);
        box.putInBoxT("Piotr");
        box.putIInBoxU(99.8);

        System.out.println(box.getFromBoxS());
        System.out.println(box.getFromBoxT());
        System.out.println(box.getFromBoxU());
    }
}
