package com.sdacademy.generics.genericmethod;

public class Main {

    public static void main(String[] args) {

        String[] arrayOfStrings = {"jeden", "dwa", "trzy"};
        Integer[] arrayOfIntegers = {1, 2, 3};
        Double[] arrayOfDoubles = {1.0, 2.0, 3.0};

        printArray(arrayOfStrings);
        printArray(arrayOfIntegers);
        printArray(arrayOfDoubles);
    }

    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }
}
