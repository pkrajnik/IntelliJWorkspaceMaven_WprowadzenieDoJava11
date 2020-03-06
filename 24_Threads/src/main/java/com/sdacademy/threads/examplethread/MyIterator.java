package com.sdacademy.threads.examplethread;

public class MyIterator extends Thread {
    private int number;

    public MyIterator(int startingNumber, String threadName) {
        super(threadName);
        this.number = startingNumber;
    }

    private void iterate() {
        for (; number < 10; number++) {
            System.out.println("Watek: " + Thread.currentThread().getName() +
                    "[ID=" + Thread.currentThread().getId() + "] Wartosc number: " + number);
        }
    }

    @Override
    public void run() {
        iterate();
    }
}
