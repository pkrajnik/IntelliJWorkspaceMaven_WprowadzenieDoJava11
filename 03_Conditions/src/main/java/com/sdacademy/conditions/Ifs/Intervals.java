package com.sdacademy.conditions.Ifs;

public class Intervals {

    public static void main(String[] args) {

        //sprawdzmy w ktorym przedziale znajduje sie liczba
        //    (... ; 4) [4 ; 9] (9 ; 200) [200 ; ...)

        int ourNumber = 200;

        if (ourNumber < 4) {
            System.out.println("Liczba " + ourNumber + " nalezy do przedzialu (... ; 4)");
        } else if (ourNumber >= 4 && ourNumber <= 9) {
            System.out.println("Liczba " + ourNumber + " nalezy do przedzialu [4 ; 9]");
        } else if (ourNumber > 9 && ourNumber < 200) {
            System.out.println("Liczba " + ourNumber + " nalezy do przedzialu (9 ; 200)");
        } else {
            System.out.println("Liczba " + ourNumber + " nalezy do przedzialu [200 ; ...)");
        }
    }
}
