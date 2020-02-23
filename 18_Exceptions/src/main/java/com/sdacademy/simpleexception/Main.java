package com.sdacademy.simpleexception;

public class Main {

    public static void main(String[] args) {

        String text = null;

        try {
            System.out.println(text.charAt(0));
        } catch (NullPointerException e) {
            System.out.println("Nie mozna odwolywac sie do pol obiektu, ktory jest nullem!");
        }
    }
}
