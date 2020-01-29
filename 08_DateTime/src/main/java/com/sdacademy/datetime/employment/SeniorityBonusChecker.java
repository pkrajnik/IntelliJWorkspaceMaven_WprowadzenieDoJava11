package com.sdacademy.datetime.employment;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SeniorityBonusChecker {

    public static void checkIfSeniorityBonusShouldBePaid(Employee employee) {
        String dateOfEmploymentText = employee.getDateOfEmployment();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dateOfEmployment = LocalDate.parse(dateOfEmploymentText, dateFormatter);
        LocalDate dateNow = LocalDate.now();

        if(dateNow.minusYears(10).isAfter(dateOfEmployment)) {
            System.out.println("Pracownikowi: " + employee.getFirstName()+" "+employee.getLastName() + " nalezy sie dodatek stazowy");
        } else {
            System.out.println("Pracownikowi: " + employee.getFirstName()+" "+employee.getLastName() + " nie nalezy sie dodatek stazowy");
        }
    }
}
