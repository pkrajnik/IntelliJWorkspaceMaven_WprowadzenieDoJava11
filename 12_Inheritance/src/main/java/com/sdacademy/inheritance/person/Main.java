package com.sdacademy.inheritance.person;

public class Main {

    public static void main(String[] args) {

        Person jan = new Politician("Jan", "Kowalski", 45, "PO");
        Person marcin = new Politician("Marcin", "Nowak", 54, "PIS");
        Person krzysztof = new Student("Krzysztof", "Nowicki", 22, "UKW", "A126353");

        Person[] persons = {jan, marcin, krzysztof};

        for (Person p : persons) {
            p.description();
            System.out.println();
        }
    }
}
