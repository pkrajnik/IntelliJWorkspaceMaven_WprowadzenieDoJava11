package com.sdacademy.set;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Set<String> setOfWords = new HashSet();
        setOfWords.add("napis1");
        setOfWords.add("napis2");
        setOfWords.add("napis1");
        System.out.println("Ilosc napisow w zbiorze: "+setOfWords.size());
        for (String word: setOfWords){
            System.out.println(word);
        }

        String sentence="Jestem programista Javy.";
        Set<Character> lettersUsedInSentence = new HashSet<>();
        for(int i=0;i<sentence.length();i++){
            lettersUsedInSentence.add(sentence.charAt(i));
        }
        System.out.println("Literki uzyte w zdaniu: "+sentence);
        for (char letter: lettersUsedInSentence){
            System.out.println(letter);
        }

        Set<Person> persons = new HashSet<>();
        persons.add(new Person("Piotr","Krajnik"));
        persons.add(new Person("Adam","Nowak"));
        persons.add(new Person("Marian","Nowicki"));
        persons.remove(new Person("Piotr","Krajnik"));
        for (Person person : persons){
            System.out.println(person);
        }
        System.out.println("Czy Adam Nowak jest w zbiorze ? "
                +persons.contains(new Person("Adam","Nowak")));
    }
}
