package com.sdacademy.type.presentation;

public class TypePresentation {

    public static void main(String[] args) {

        //deklaracja zmiennej i podstawienie pod nia wartosci
        //int typ zmiennej, number1 identyfikator zmiennej, 120 wartosc zmiennej
        int number1 = 120;
        //mozna w jednej linii zadeklarowac, a w drugiej zainicjowac (podstawic wartosc)
        //preferowany jest pierwszy sposob
        int number2;
        number2 = 9;

        int sumNumbers = number1 + number2; //dodawanie
        int subNumbers = number1 - number2; //odejmowanie
        int divNumbers = number1 / number2; //dzielenie
        int mulNumbers = number1 * number2; //mnozenie
        int modNumbers = number1 % number2; //suma modulo
        System.out.println("Lets calculate number1+number2=" + sumNumbers);
        System.out.println("Lets calculate number1-number2=" + subNumbers);
        System.out.println("Lets calculate number1/number2=" + divNumbers);
        System.out.println("Lets calculate number1*number2=" + mulNumbers);
        System.out.println("Lets calculate number1%number2=" + modNumbers);
        System.out.println();

        byte bNumber1 = 127;
        byte bNumber2 = 14;
        //UWAGA1: jezeli w wyrazeniu wystepuja zmienne typu int lub nizszych (short, byte)
        //wynik wyrazenia jest automatycznie typu int
        //jezeli chcemy taki wynik podstawic za zmienna typu nizszego niz int
        //musimy zrzutowac do tego typu nizszego, tutaj mamy rzutowanie (byte)
        byte bSum = (byte) (bNumber1 + bNumber2);
        System.out.println("Lets calculate bNumber1+bNumber2=" + bSum);
        System.out.println();


        long lNumber1 = 500000000000L; //literaly domyslnie sa intami. Literka L oznacza, ze mamy tu longa
        long lNumber2 = 111111111111L;
        long lSum = lNumber1 + lNumber2;
        System.out.println("Lets calculate lNumber1+lNumber1=" + lSum);
        System.out.println();

        double dNumber1 = 4.5;
        double dNumber2 = 1.5;
        double dDiv = dNumber1 / dNumber2;
        double dDiv2 = number1 / number2;
        double dDiv3 = (double) number1 / (double) number2;

        //Jezeli liczbe zmiennoprzecinkowa zrzutujemy do liczby calkowitej, wartosc po przecinku zostanie obcieta
        int iDiv3 = (int) dDiv3;
        System.out.println("Lets calculate dDiv=dNumber1/dNumber2=" + dDiv);
        System.out.println("Lets calculate dDiv2=number1/number2=" + dDiv2);
        System.out.println("Lets calculate dDiv3=number1/number2=" + dDiv3);
        System.out.println("iDiv3=" + iDiv3);
        System.out.println();

        boolean bool1 = 45 > 89;
        boolean bool2 = (2 < 5) && (3 + 4 == 7);
        System.out.println("Czy wyrazenie bool1 jest prawdziwe ? " + bool1);
        System.out.println("Czy wyrazenie bool2 jest prawdziwe ? " + bool2);
        System.out.println();

        char character = 'A';
        //zapis w formie codu ASCII
        char character2 = 65;
        //zapis w formie codu UNICODE (za pomoca liczby szesnastkowej)
        char character3 = '\u0041';

        System.out.println("character=" + character);
        System.out.println("character2=" + character2);
        System.out.println("character3=" + character3);
        //Jesli zdzwily Cie wyniki dwoch ostatnich linii, patrz komentarz UWAGA1
        System.out.println(character + 2);
        System.out.println((char) (character + 2));
    }
}
