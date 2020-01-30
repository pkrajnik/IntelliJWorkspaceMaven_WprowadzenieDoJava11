package com.sdacademy.enums;

import com.sdacademy.enums.notebook.NotebookBrand;

import java.util.Scanner;

public class NotebookTest {

    public static void main(String[] rags) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj marke notebooka:");
        String notebookBrand = scanner.nextLine();

        switch (notebookBrand.toUpperCase()) {
            case "ACER":
                printNotebookBrand(NotebookBrand.ACER);
                break;
            case "LENOVO":
                printNotebookBrand(NotebookBrand.LENOVO);
                break;
            case "HP":
                printNotebookBrand(NotebookBrand.HP);
                break;
            default:
                System.out.println("Nie znam takiej marki!");
                break;

        }
    }

    private static void printNotebookBrand(NotebookBrand markaNotebooka) {
        System.out.println("Marka: " + markaNotebooka + " ,niezawodnosc: " + markaNotebooka.getReliability());
    }
}
