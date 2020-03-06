package com.sdacademy.generics.shapes;

public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double circuit(){
        return 2*Math.PI* radius;
    }
}
