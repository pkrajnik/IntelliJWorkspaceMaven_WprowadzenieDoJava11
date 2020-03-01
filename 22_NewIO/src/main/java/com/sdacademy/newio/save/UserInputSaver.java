package com.sdacademy.newio.save;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Scanner;

public class UserInputSaver {

    private static final int BUFFER_SIZE = 4;

    public static void main(String[] args) {
        File outputFile = new File("files" + File.separator + "userFile.txt");
        String userText = getStringFromUser();

        RandomAccessFile outputRandomAccessFile = null;
        try {
            outputRandomAccessFile = new RandomAccessFile(outputFile, "rw"); //tryb odczyt-zapis
            outputRandomAccessFile.setLength(0); //ustaw wskaznik na poczatku pliku, aby mozna bylo nadpisac jego zawartosc
        } catch (IOException e) {
            e.printStackTrace();
        }
        FileChannel outChannel = outputRandomAccessFile.getChannel(); //stworz kanal pliku wyjsciowego
        ByteBuffer outBufor = ByteBuffer.allocate(BUFFER_SIZE); //stworz bufor pluku wyjsciowego

        try {
            char[] charArr = userText.toCharArray(); //zmien stringa na tablice znakow

            int buffIdx = 0;
            for (int i = 0; i < charArr.length; i++) { //iteruj po kazdym znaku z tablicy
                if (buffIdx < BUFFER_SIZE) { //jezeli bufor nie jest zapelniony, dodawaj do niego kolejne znaki
                    outBufor.put((byte) charArr[i]);
                    buffIdx++;
                } else { //w przeciwnym wypadku zapisz jego zawartosc do pliku
                    outBufor.flip(); //ustaw wskaznik buforu na jego poczatku
                    outChannel.write(outBufor);
                    outBufor.clear(); //wykasuj zawartosc bufora
                    buffIdx = 0;
                    outBufor.put((byte) charArr[i]);
                    buffIdx++;
                }
            }
            //zapisz reszte danych do pliku
                outBufor.flip();
                outChannel.write(outBufor);
                outBufor.clear();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                outputRandomAccessFile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static String getStringFromUser() {
        Scanner scanner = new Scanner(System.in);
        String text = "";

        System.out.println("Podaj tekst (slowo koniec konczy zapis):");

        String textLine = scanner.nextLine();
        while (!textLine.equals("koniec")) {
            text += textLine;
            text += (System.lineSeparator());
            textLine = scanner.nextLine();
        }
        return text;
    }
}
