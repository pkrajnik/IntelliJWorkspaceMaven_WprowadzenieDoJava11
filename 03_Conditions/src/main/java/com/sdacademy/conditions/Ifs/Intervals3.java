package com.sdacademy.conditions.Ifs;

public class Intervals3 {

    public static void main(String[] args) {

        //sprawdzmy w ktorym przedziale znajduje sie liczba
        //    (... ; 4) [4 ; 9] (9 ; 200) [200 ; ...)

        int ourNumber = 20;

        writeIntervalForNumber(ourNumber);
        writeIntervalForNumber(-2);
        writeIntervalForNumber(111);
        writeIntervalForNumber(200);
    }

    public static void writeIntervalForNumber(int number){
        String liczbaText ="Liczba ";
        String nalezyText =" nalezy do przedzialu ";

        if (number < 4) {
            System.out.println(liczbaText + number +nalezyText+"(... ; 4)");
        } else if (number >= 4 && number <= 9) {
            System.out.println(liczbaText + number + nalezyText+"[4 ; 9]");
        } else if (number > 9 && number < 200) {
            System.out.println(liczbaText + number + nalezyText+"(9 ; 200)");
        } else {
            System.out.println(liczbaText + number + nalezyText+"[200 ; ...)");
        }
    }
}
