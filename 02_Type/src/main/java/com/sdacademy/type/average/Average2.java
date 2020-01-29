package com.sdacademy.type.average;

import java.util.Scanner;

public class Average2 {

    public static void main(String [] args){

        //Za pomoca Scannera mozemy wczytac dane z wejscia,
        //czyli z klawiatury
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj a: ");
        double a=scanner.nextDouble();
        System.out.print("Podaj b: ");
        double b=scanner.nextDouble();
        System.out.print("Podaj c: ");
        double c=scanner.nextDouble();

        double avg = (a+b+c)/3;
        System.out.println("Srednia wynosi="+avg);
    }
}
