package com.sdacademy.files.example3;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        //scannerExample();
        bufferedReaderExample();
        //bufferedWriterExample();
    }

    private static void bufferedWriterExample() throws IOException {
        try (BufferedWriter bufferedWriter = new BufferedWriter(
                new FileWriter(new File("files" + File.separator + "example3" + File.separator + "destinationFile.txt")))) {
            bufferedWriter.write("String testowy.");
            bufferedWriter.newLine();
            bufferedWriter.write("String testowy 2.");
            bufferedWriter.flush();
        }
    }

    private static void bufferedReaderExample() throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(getStreamFromSource()))) {
            String line = bufferedReader.readLine();
            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        }
    }

    private static void scannerExample() throws IOException {
        Scanner scanner = new Scanner(getStreamFromSource());
        scanner.useDelimiter("\n");
        while (scanner.hasNext()) {
            String line = scanner.next();
            System.out.println(line);
        }
    }

    private static InputStream getStreamFromSource() throws IOException {
        return getFileStream();
        // return getUrlConnectionStream();
        //return getInMemoryStream();
    }

    private static InputStream getInMemoryStream() {
        return new ByteArrayInputStream("hello".getBytes());
    }

    private static InputStream getFileStream() throws FileNotFoundException {
        return new FileInputStream(Paths.get("files" + File.separator + "example3", "sourceFile.txt").toFile());
    }

    private static InputStream getUrlConnectionStream() throws IOException {
        URLConnection urlConnection = new URL("https://www.wp.pl").openConnection();
        return urlConnection.getInputStream();
    }
}

