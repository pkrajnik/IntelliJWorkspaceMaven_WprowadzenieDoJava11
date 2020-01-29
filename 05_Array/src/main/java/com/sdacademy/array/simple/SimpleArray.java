package com.sdacademy.array.simple;

public class SimpleArray {

    public static void main(String[] args) {

        int[] numbersArray = new int[5];

        numbersArray[0] = 7;
        numbersArray[1] = 1;
        numbersArray[2] = 4;
        numbersArray[3] = 2;
        numbersArray[4] = 7;

        System.out.println("Array length= "+numbersArray.length);
        System.out.println("numbers[3]= "+numbersArray[3]);

        System.out.println("Whole array:");
        printArray(numbersArray);

        int[] numbersArray2= {34,33,1,3,4,343,3,3344};

        System.out.println("\n\n\nArray2 length= "+numbersArray2.length);
        System.out.println("number2s[5]= "+numbersArray2[5]);

        System.out.println("Whole array:");
        printArray(numbersArray2);
    }

    public static void printArray(int[] ourArray){
        System.out.print("[");
        for (int i=0;i<ourArray.length;i=i+1){
            System.out.print(ourArray[i]);
            if (i<ourArray.length-1)
            {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
}
