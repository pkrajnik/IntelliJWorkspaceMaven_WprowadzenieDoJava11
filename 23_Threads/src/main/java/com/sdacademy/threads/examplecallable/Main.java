package com.sdacademy.threads.examplecallable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        //Inne watki dzialaja niezalezni od naszego watku, stad trudno przewidziec kiedy otrzymamy wynik ich dzialania.
        //Interfejs Future sluzy do pobierania przyszlych wynikow watkow.
        List<Future<String>> listOfFutureWords = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            Future<String> futureWord = executorService.submit(new RandomWord());
            listOfFutureWords.add(futureWord);
        }
        executorService.shutdown();

        for (Future<String> futureWord : listOfFutureWords) { //iterujemy po liście naszych Future'ów
            try {
                //metoda get zwróci wartość naszego Future'a o ile już się pojawiła.
                //W przeciwnym wypadku będzie czekać na jej pojawienie. Dopiero wtedy program ruszy dalej.
                String word = futureWord.get();
                System.out.println(word);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
    }
}


