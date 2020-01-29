package com.sdacademy.array.remove;

public class ArrayRemove {

    public static void main(String args[]){

        String[] arrayVehicles = {"Car","Train","Airplane","Bike","Ship"};
        printArray(arrayVehicles);

        arrayVehicles = removeElementFromArray(arrayVehicles, 1);
        printArray(arrayVehicles);
    }

    public static String[] removeElementFromArray(String[] sourceArray, int indexOfElementToRemove){

        String[] arrayAfterRemove = new String[sourceArray.length-1];
        int indexInArrayAfterRemove=0;

        for(int i=0; i<sourceArray.length;i++){
            if (i != indexOfElementToRemove){
                arrayAfterRemove[indexInArrayAfterRemove] = sourceArray[i];
                indexInArrayAfterRemove++;
            }
        }

        return arrayAfterRemove;
    }

    public static void printArray(String[] ourArray){
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
