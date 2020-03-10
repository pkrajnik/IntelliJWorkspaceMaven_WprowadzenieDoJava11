package com.sdacademy.innerclasses.classinclass;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person("Jan",34);
        Person.FamilyDetails familyDetailsOfPerson1 = person1.new FamilyDetails(true,3);

        person1.printDescription();
        familyDetailsOfPerson1.printDetails();
    }
}
