package com.sdacademy.innerclasses.anonymous;

public class MainWithoutAnonymous {
    public static void main(String[] args) {

        //Podejscie tradycyjne - klasa CalculatorImpl jest implementerem
        //interfejsu Calculator
        Calculator calc = new CalculatorImpl();
        System.out.println("Suma: " + calc.add(3, 5));
        System.out.println("Roznica liczb: " + calc.substract(3, 5));
    }
}
