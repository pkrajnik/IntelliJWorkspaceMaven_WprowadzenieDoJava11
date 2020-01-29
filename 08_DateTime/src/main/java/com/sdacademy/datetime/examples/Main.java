package com.sdacademy.datetime.examples;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {

        LocalDate dateToday = LocalDate.now();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd--MM--yyyy");
        String textToday = dateToday.format(dateFormatter);
        System.out.println("Dzisiejsza data: " + textToday);

        LocalDate dateWeekAgo = dateToday.minusWeeks(1);
        String textWeekAgo = dateWeekAgo.format(dateFormatter);
        System.out.println("Tydzien temu data: " + textWeekAgo);

        System.out.println("Czy tydzien temu bylo wczesniej? " + dateWeekAgo.isBefore(dateToday));

        LocalTime currentHour = LocalTime.now();
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
        System.out.println("Biezaca godzina: " + currentHour.format(timeFormatter));

        LocalDateTime dateTimeToday = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm:ss");
        System.out.println(dateTimeToday.format(dateTimeFormatter));

        ZonedDateTime timeParis = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
        ZonedDateTime timeTokyo = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        ZonedDateTime timeLosAngeles = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));

        System.out.println("W Paryzu jest teraz " + timeParis.format(dateTimeFormatter));
        System.out.println("W Tokyo jest teraz " + timeTokyo.format(dateTimeFormatter));
        System.out.println("W Los Angeles jest teraz " + timeLosAngeles.format(dateTimeFormatter));

        String dateText1 = "12--09--1998";
        String dateText2 = "12--10--1998";
        LocalDate date1 = LocalDate.parse(dateText1, dateFormatter);
        LocalDate date2 = LocalDate.parse(dateText2, dateFormatter);
        if (date1.isAfter(date2)) {
            System.out.println(date1 + " jest wczesniej, niz " + date2);
        } else if (date1.isBefore(date2)) {
            System.out.println(date1 + " jest wczesniej, niz " + date2);
        } else {
            System.out.printf(date1 + " i " + date2 + " to ta sama data");
        }
    }
}
