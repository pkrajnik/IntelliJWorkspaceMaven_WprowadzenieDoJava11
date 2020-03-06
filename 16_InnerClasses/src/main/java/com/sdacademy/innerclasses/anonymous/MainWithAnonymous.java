package com.sdacademy.innerclasses.anonymous;

public class MainWithAnonymous {

    public static void main(String[] args) {

        //Podejscie anonimowe - tworzymy anonimowy implementer interfejsu Calculator
        //i z miejsca definiujemy jego metody
        Calculator calc = new Calculator() {
            @Override
            public double add(double number1, double number2) {
                return number1 + number2;
            }

            @Override
            public double substract(double number1, double number2) {
                return number1 - number2;
            }
        };

        System.out.println("Suma liczb: " + calc.add(3, 5));
        System.out.println("Roznica liczb: " + calc.substract(3, 5));
    }
}
