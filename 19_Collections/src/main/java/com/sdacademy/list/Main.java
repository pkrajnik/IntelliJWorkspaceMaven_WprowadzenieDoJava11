package com.sdacademy.list;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> words = new ArrayList<>();

        words.add("Biurko");
        words.add("Szafa");
        words.add("Kredens");
        words.add("Lampa");

        System.out.println("Ilosc wyrazow: "+words.size());
        for(String w:words) {
            System.out.println(w);
        }

        words.remove("Biurko");

        System.out.println("Ilosc wyrazow: "+words.size());
        for(String w:words) {
            System.out.println(w);
        }

        words.remove(1);

        System.out.println("Ilosc wyrazow: "+words.size());
        for(String w:words) {
            System.out.println(w);
        }

        List<String> wyrazy2 = new ArrayList<>();
        wyrazy2.add("Szafa");
        wyrazy2.add("Lampa");

        System.out.print("Czy wszystkie wyrazy z listy wyrazy2 znajduja sie na liscie wyrazy? ");
        System.out.println(words.containsAll(wyrazy2));

        List<Integer> listOfNumbers = new ArrayList<>();
        listOfNumbers.add(5);
        listOfNumbers.add(1);
        listOfNumbers.add(2);
        listOfNumbers.add(3);

        List<Integer> listOfNumbers2 = new ArrayList<>();
        listOfNumbers2.add(5);
        listOfNumbers2.add(1);
        listOfNumbers2.add(3);
        listOfNumbers2.add(2);

        System.out.print("Czy listOfNumbers jest rowna listOfNumbers2 ? "+listOfNumbers.equals(listOfNumbers2));
    }
}
