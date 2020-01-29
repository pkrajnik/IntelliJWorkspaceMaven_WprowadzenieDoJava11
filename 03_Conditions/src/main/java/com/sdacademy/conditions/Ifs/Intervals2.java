package com.sdacademy.conditions.Ifs;

public class Intervals2 {

    public static void main(String[] args) {

        //sprawdzmy w ktorym przedziale znajduje sie liczba
        //    (... ; 4) [4 ; 9] (9 ; 200) [200 ; ...)

        int ourNumber = 20;
        String liczbaText ="Liczba ";
        String nalezyText =" nalezy do przedzialu ";

        if (ourNumber < 4) {
            System.out.println(liczbaText + ourNumber +nalezyText+"(... ; 4)");
        } else if (ourNumber >= 4 && ourNumber <= 9) {
            System.out.println(liczbaText + ourNumber + nalezyText+"[4 ; 9]");
        } else if (ourNumber > 9 && ourNumber < 200) {
            System.out.println(liczbaText + ourNumber + nalezyText+"(9 ; 200)");
        } else {
            System.out.println(liczbaText + ourNumber + nalezyText+"[200 ; ...)");
        }
    }
}
