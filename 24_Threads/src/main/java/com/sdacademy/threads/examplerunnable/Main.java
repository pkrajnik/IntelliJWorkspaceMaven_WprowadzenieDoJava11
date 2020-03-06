package com.sdacademy.threads.examplerunnable;

public class Main {

    public static void main(String[] args) {
        MyIterator myIterator1 = new MyIterator(0);
        MyIterator myIterator2 = new MyIterator(0);

        Thread thread1 = new Thread(myIterator1, "watek1");
        Thread thread2 = new Thread(myIterator2, "watek2");

        thread1.start();
        thread2.start();
    }
}
