package com.sdacademy.classbasics.point;

public class Main {

    public static void main(String[] args){

        Point p1= new Point(1,2);
        Point p2= new Point(3,3);

        System.out.println("Distance between points "+p1+", and "+p2+": "+p1.distance(p2));
    }
}
