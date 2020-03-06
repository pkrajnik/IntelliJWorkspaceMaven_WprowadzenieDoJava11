package com.sdacademy.simpleexception2;

public class Main {

    public static void main(String[] args) {

        //zostanie wyrzucony wyjatek
        try {
            User user1= new User("Piotr","piotr.com");
        } catch (EmailFormatException e) {
            System.out.println("Nastapil wyjatek, wiadomosc: "+e.getMessage());
        }

        //nie powinien zostac wyrzucony wyjatek
        try {
            User user2= new User("Piotr","piotr@lp.com");
        } catch (EmailFormatException e) {
            System.out.println("Nastapil wyjatek, wiadomosc: "+e.getMessage());
        }

    }
}
