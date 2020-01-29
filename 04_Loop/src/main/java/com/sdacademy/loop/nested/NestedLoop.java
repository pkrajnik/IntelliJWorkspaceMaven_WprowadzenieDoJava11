package com.sdacademy.loop.nested;

public class NestedLoop {

    public static void main(String[] args){
        printNumbers();
    }

    public static void printNumbers(){

        for (int i=1;i<=9;i++){
            for (int j=1;j<=9;j++){
                System.out.print((char)(63+i+j)+" ");
            }
            System.out.println();
        }
    }
}
