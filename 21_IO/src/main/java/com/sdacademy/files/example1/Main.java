package com.sdacademy.files.example1;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        String thisLine;
        File sourceFile = new File("files" + File.separator + "example1" + File.separator + "sourceFile.txt");
        File destinationFile = new File("files" + File.separator + "example1" + File.separator + "destinationFile.txt");

        //try with resource, od javy 7. po wyjsciu z bloku try
        //zasoby reader i writer zostana automatycznie zamkniete
        // nie trzeba samemu ich zamykac w bloku finally
        try (BufferedReader br = new BufferedReader(new FileReader(sourceFile));
             BufferedWriter bw = new BufferedWriter(new FileWriter(destinationFile, true))
        ) {
            while ((thisLine = br.readLine()) != null) {
                System.out.println(thisLine);
                bw.append(thisLine + System.lineSeparator());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}

