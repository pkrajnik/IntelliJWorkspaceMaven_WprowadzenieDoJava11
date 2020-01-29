package com.sdacademy.loop.sum;

public class LoopSum {

    public static void main(String[] args) {
        System.out.println("Sum of numbers from 2 to 5 = " + sum(2, 5));
    }

    public static int sum(int from, int to) {
        int sumOfNumbers = 0;

        for (int i = from; i <= to; i++) {
            sumOfNumbers = sumOfNumbers + i;
        }

        return sumOfNumbers;
    }
}
