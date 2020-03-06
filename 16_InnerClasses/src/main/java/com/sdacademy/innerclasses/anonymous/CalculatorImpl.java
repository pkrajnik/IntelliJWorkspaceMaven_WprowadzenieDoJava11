package com.sdacademy.innerclasses.anonymous;

public class CalculatorImpl implements Calculator {

    @Override
    public double add(double number1, double number2) {
        return number1 + number2;
    }

    @Override
    public double substract(double number1, double number2) {
        return number1 - number2;
    }
}
