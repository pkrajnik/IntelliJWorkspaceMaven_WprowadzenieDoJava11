package com.sdacademy.newio.filecopier;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileCopier {

    public static void main(String[] args) {

        File inputFile = new File("files" + File.separator + "sourceFile.txt");
        File outputFile = new File("files" + File.separator + "destinationFile.txt");

        RandomAccessFile inputRandomAccessFile = null;
        RandomAccessFile outputRandomAccessFile = null;
        try {
            inputRandomAccessFile = new RandomAccessFile(inputFile, "r");
            outputRandomAccessFile = new RandomAccessFile(outputFile, "rw");
            outputRandomAccessFile.seek(outputFile.length()); //ustaw wskaznik na koncu pliku
        } catch (IOException e) {
            e.printStackTrace();
        }
        FileChannel inChannel = inputRandomAccessFile.getChannel();
        FileChannel outChannel = outputRandomAccessFile.getChannel();

        ByteBuffer inBufor = ByteBuffer.allocate(16);
        ByteBuffer outBufor = ByteBuffer.allocate(16);

        int numberOfBytesReaded = 0;
        try {
            numberOfBytesReaded = inChannel.read(inBufor);

            while (numberOfBytesReaded != -1) {

                System.out.println("\n--Przeczytano " + numberOfBytesReaded + " bajtów -- \n");
                inBufor.flip(); //przestaw bufor aby mozna bylo z niego czytac uzywajac metody get

                while (inBufor.hasRemaining()) {
                    byte znak = inBufor.get();
                    System.out.print((char) znak);
                    outBufor.put(znak);
                }

                inBufor.clear();
                numberOfBytesReaded = inChannel.read(inBufor);

                outBufor.flip(); //przestaw bufor aby mozna bylo zapisac jego zawartosc
                outChannel.write(outBufor);
                outBufor.clear();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                inputRandomAccessFile.close();
                outputRandomAccessFile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
