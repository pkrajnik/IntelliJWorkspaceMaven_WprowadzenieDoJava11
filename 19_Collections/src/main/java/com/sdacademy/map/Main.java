package com.sdacademy.map;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        //mapa imie->wiek
        Map<String, Integer> nameAge = new HashMap<>();
        nameAge.put("Adam", 11);
        nameAge.put("Paweł", 65);
        nameAge.put("Ola", 23);
        nameAge.put("Agnieszka", 43);
        System.out.println(nameAge);

        //mapa stanowisko->lista pracownikow
        Map<String, List<String>> mapPositionEmployees = new HashMap<>();
        List<String> plumbers = new ArrayList<>();
        plumbers.add("Stefan");
        plumbers.add("Mateusz");
        plumbers.add("Alfred");
        mapPositionEmployees.put("hydraulicy", plumbers);
        List<String> mechanics = new ArrayList<>();
        mechanics.add("Karol");
        mechanics.add("Adam");
        mapPositionEmployees.put("mechanicy", mechanics);
        System.out.println(mapPositionEmployees);

        //mapa wystapien slow
        String sentence = "Jestem programista programista jezyka Java Java jest modnym jezykiem";
        List<String> words = Arrays.asList(sentence.split("\\s"));
        System.out.println(words);

        Map<String, Integer> numberOfWordsOccurrences = new HashMap<>();
        for (String word : words) {
            if (numberOfWordsOccurrences.containsKey(word)) {
                numberOfWordsOccurrences.put(word, numberOfWordsOccurrences.get(word) + 1);
            } else {
                numberOfWordsOccurrences.put(word, 1);
            }
        }
        System.out.println(numberOfWordsOccurrences);
    }
}
