package com.sdacademy.datetime.employment;

public class Employee {

    private String firstName;
    private String lastName;
    private String dateOfEmployment;

    public Employee(String firstName, String lastName, String dateOfEmployment) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfEmployment = dateOfEmployment;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDateOfEmployment() {
        return dateOfEmployment;
    }
}
