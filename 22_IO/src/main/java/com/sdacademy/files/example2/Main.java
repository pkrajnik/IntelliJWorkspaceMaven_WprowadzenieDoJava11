package com.sdacademy.files.example2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        try {
            List<String> lines = Files.readAllLines(Paths.get("files" + File.separator + "example2", "names.txt"));
            Files.write(Paths.get("files"+ File.separator + "example2", "names_copy.txt"), lines);

            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Blad podczas czytania pliku!");
        }
    }
}


