package com.sdacademy.set;

import java.util.Objects;

public class Person {

    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName);
    }

    @Override
    public int hashCode() {
        return 3;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + firstName + '\'' +
                ", nazwisko='" + lastName + '\'' +
                '}';
    }
}
