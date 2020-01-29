package com.sdacademy.loop.intro;

public class LoopsIntroduction {

    public static void main(String[] args) {

        // forExample();
        // whileExample();
        doWhileExample();
    }

    public static void forExample() {

        for (int i = 1; i <= 3; i++) {
            System.out.println("Saying hello");
            System.out.println("in for loop !");
        }
    }

    public static void whileExample() {

        int counter = 1;
        while (counter <= 3) {
            System.out.println("Saying hello");
            System.out.println("in while loop !");
            counter++;
        }
    }

    public static void doWhileExample() {

        int counter = 1;
        do {
            System.out.println("Saying hello");
            System.out.println("in do while loop !");
            counter++;
        } while (counter <= 3);
    }
}
