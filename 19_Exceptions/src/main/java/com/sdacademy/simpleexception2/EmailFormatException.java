package com.sdacademy.simpleexception2;

public class EmailFormatException extends Exception{

    public EmailFormatException(String message) {
        super(message);
    }
}
