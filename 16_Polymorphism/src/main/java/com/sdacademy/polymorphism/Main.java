package com.sdacademy.polymorphism;

import com.sdacademy.polymorphism.animal.Alligator;
import com.sdacademy.polymorphism.animal.Cat;
import com.sdacademy.polymorphism.animal.Animal;

public class Main {

    public static void main(String[] args) {
        Animal alligator = new Alligator("Kroks");
        Animal kot = new Cat("Waclaw");

       //obie zmienne mają typ Animal, ale zachowują się właściwie do rzeczywistej klasy obiektów przypisanych do
       //tych zmiennych
       alligator.talk();
       alligator.move();
       kot.talk();
       kot.move();

    }
}
