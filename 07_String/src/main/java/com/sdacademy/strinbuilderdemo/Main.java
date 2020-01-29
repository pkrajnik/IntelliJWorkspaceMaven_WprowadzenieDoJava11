package com.sdacademy.strinbuilderdemo;

public class Main {

    public static void main(String[] args) {

        StringBuilder text1 = new StringBuilder("Ucze sie programowac");
        StringBuilder text2 = text1;
        text2 = text2.append(" w Javie");

        System.out.println(text1);
        System.out.println(text2);

        StringBuilder text3 = new StringBuilder("Ala ma kota");
        text3.append(" i psa");
        text3.reverse();
        System.out.println(text3);

        StringBuilder text4 = new StringBuilder("A jego imie czterdziesci i cztery");
        //fluent interface
        text4.insert(text4.length()," ...").delete(0,2).append(" a nie piecdziesiat");
        System.out.println(text4);
    }
}
