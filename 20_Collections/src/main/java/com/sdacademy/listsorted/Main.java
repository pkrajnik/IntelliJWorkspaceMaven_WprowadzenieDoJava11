package com.sdacademy.listsorted;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Movie> listOfMovies = new ArrayList<>();
        listOfMovies.add(new Movie("Pila",2004));
        listOfMovies.add(new Movie("Przeminelo z Witarem",1939));
        listOfMovies.add(new Movie("Miasteczko Twin Peaks",1990));
        listOfMovies.add(new Movie("Amelia",2001));
        listOfMovies.add(new Movie("Smerfy",2011));
        listOfMovies.add(new Movie("Znachor",1981));

        System.out.println("Filmy przed sortowaniem:");
        for(Movie f:listOfMovies){
            System.out.println(f);
        }

        Collections.sort(listOfMovies);

        System.out.println("Filmy po sortowaniu:");
        for(Movie f:listOfMovies){
            System.out.println(f);
        }
    }
}
