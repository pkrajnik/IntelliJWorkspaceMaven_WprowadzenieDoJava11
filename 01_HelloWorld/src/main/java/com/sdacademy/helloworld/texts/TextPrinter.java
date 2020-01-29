package com.sdacademy.helloworld.texts;

public class TextPrinter {

    public static void main(String[] args) {

        //print - wypisuje tekst
        //println - wypisuje tekst i przechodzi do nowej linii
        System.out.print("Hello!\n");
        System.out.print("My name is Adam.");
        System.out.print(" I'm 20 years old");
        System.out.println();
        System.out.print("I'm " + 20 + " years old");
        System.out.println();
        System.out.println("I've decided to became JAVA developer\n\n\n");
        System.out.println("You may wish me \"good luck!\"");
        System.out.println("Lets calculate something: 2 + 12 = " + 2 + 12 + " correct?");
        System.out.println("Lets try again: 2 + 12 = " + (2 + 12) + " correct?");

        System.out.print("\n\n");

        //printf - wypisuje tekst z uzyciem formatowania
        //% oznacza poczatek lancucha formatujacego, na miejsce ktorego zostanie
        //podtsawiony sformatowany argument
        //w jednym printf moze byc wiele lancychow formatujacych
        System.out.printf("Number=%d\n", 23);
        System.out.printf("Number=%10d\n", 23);
        System.out.printf("Number=%-10d\n", 23);

        System.out.printf("Number1=%d Number2=%d Number3=%d\n", 11, 12, 13);

        System.out.printf("Pi=%f\n", 3.14159265359);
        System.out.printf("Pi=%.2f\n", 3.14159265359);
        System.out.printf("Pi=%7.2f\n", 3.14159265359);
        System.out.printf("Pi=%-7.2f\n", 3.14159265359);

        //Wiecej informacji o formatowaniu
        //https://alvinalexander.com/programming/printf-format-cheat-sheet
    }
}
