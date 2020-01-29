package com.sdacademy.array.array2d;

public class Array2dDemonstration {

    public static void main(String[] args) {

        String[][] table ={{"A", "B"},{"C", "D"}};

        printCell(table, 0, 0);
        printCell(table, 0, 1);
        printCell(table, 1, 0);
        printCell(table, 1, 1);

        System.out.println("\n\n");

        String[][] table2 = new String[2][];
        String[] row1 = new String[2];
        row1[0] = "W";
        row1[1] = "X";
        String[] row2 = new String[2];
        row2[0] = "Y";
        row2[1] = "Z";
        table2[0] = row1;
        table2[1] = row2;

        printCell(table2, 0, 0);
        printCell(table2, 0, 1);
        printCell(table2, 1, 0);
        printCell(table2, 1, 1);
    }

    private static void printCell(String[][] table, int row, int column) {
        System.out.printf("[%d][%d] => %s\n", row, column,
                table[row][column]);
    }
}
