package com.sdacademy.threads.examplecallable;

import java.util.Random;
import java.util.concurrent.Callable;

//W Callable nalezy podac typ obiektu, ktory zostanie zwrocony, tutaj String
public class RandomWord implements Callable<String> {

    private static final String[] WORDS = {"FILM", "SAMOCHOD", "BIURKO", "WIDELEC"};
    private static Random random = new Random();

    @Override
    public String call() throws Exception {
        return getRandomWord();
    }

    private String getRandomWord() {
        return WORDS[random.nextInt(WORDS.length)];
    }
}


