package com.sdacademy.threads.examplethread;

public class Main {

    public static void main(String[] args) {
        Thread thread1 = new MyIterator(0, "WatekIteracyjny1");
        Thread thread2 = new MyIterator(0, "WatekIteracyjny2");

        thread1.start();
        thread2.start();
    }
}
