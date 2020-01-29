package com.sdacademy.type.average;

public class Average3 {

    public static void main(String [] args){
        //Oczekujemy wywolania programu z trzema parametrami bedacymi liczbami
        //Parametry przechowywane sa w args

        //Aby uruchomic program z przekazywaniem do niego parametrow
        //Sposob1: Wejsc do katalogu out\production\02_Type
        //java com.sdacademy.type.average.Average3 4 5 6

        //Sposob2: uzyc Run ->Edit Configuration w IntelliJ
        //i w Program Arguments wpisac parametry

        double a=Double.parseDouble(args[0]);
        double b=Double.parseDouble(args[1]);
        double c=Double.parseDouble(args[2]);

        double avg = (a+b+c)/3;

        System.out.println("avg="+avg);
    }
}
