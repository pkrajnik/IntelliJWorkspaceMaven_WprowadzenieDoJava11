package com.sdacademy.stringdemo;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String text1 = "Ucze sie programowac";
        String text2 = text1;
        text2 = text2 + " w Javie";

        System.out.println(text1);
        System.out.println(text2);

        String text3 = "Ala ma kota";
        String text4 = "aLa";
        System.out.println(text3.contains(text4));
        System.out.println(text3.toUpperCase().contains(text4.toLowerCase()));
        text3 = text3.toLowerCase();
        text4 = text4.toLowerCase();
        System.out.println(text3.contains(text4));
        text3.charAt(4);

        //fluent interface
        String text5 = " AlA MaKoTa ".toLowerCase().substring(0, 7).trim();
        System.out.println(text5);

        String text6="Adam ma 28 lat";
        String[] text6splitted= text6.split(" ");
        System.out.println(Arrays.toString(text6splitted));

        String text7=" Ten kubek jest zielony.";
        text7=text7.repeat(3);
        System.out.println(text7);

        String text8="       ";
        System.out.println(text8.isBlank());

        String text9="";
        System.out.println(text9.isEmpty());
    }
}
