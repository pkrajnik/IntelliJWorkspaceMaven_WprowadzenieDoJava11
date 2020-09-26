package com.sdacademy.wrappersexample;

public class Main {
    public static void main(String[] args) {

        int number = 6;
        Integer numberObject = new Integer(6);
        Integer numberObject2 = Integer.valueOf(6);
        Integer numberObject3 = Integer.valueOf("6");
        Integer numberObject4 = Integer.valueOf("110", 2);
        Integer numberObject5 = Integer.valueOf("3ef", 16);

        System.out.println(numberObject5);

        int number5 = numberObject5.intValue();
        double number5double = numberObject5.doubleValue();

        //AUTOBOXING
        Integer numberObject6 = 77;
        numberObject6++;
        int liczba6 = numberObject6;

        System.out.println(Integer.max(243, 67));
        System.out.println(Integer.min(243, 67));

        System.out.println(Integer.toBinaryString(1007));
        System.out.println(Integer.toHexString(1007));

        boolean logicalValue1 = Boolean.valueOf("False");
        boolean logicalValue2 = Boolean.valueOf("TrUe");
        System.out.println(logicalValue1);
        System.out.println(logicalValue2);

        System.out.println(Character.isDigit('8'));
        System.out.println(Character.isDigit('a'));
        System.out.println(Character.isUpperCase('a'));
        System.out.println(Character.isUpperCase('A'));
        double doubleValue = Double.parseDouble("444.55");
        System.out.println(doubleValue);

        Integer big = 200;
        int small = 200;
        System.out.println(big == small);
    }
}
