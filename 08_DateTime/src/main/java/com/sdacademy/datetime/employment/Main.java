package com.sdacademy.datetime.employment;

public class Main {

    public static void main(String[] args) {
        Employee e1 = new Employee("Adam", "Nowak", "01/01/2017");
        Employee e2 = new Employee("Maciej", "Kowalski", "01/01/1997");

        SeniorityBonusChecker.checkIfSeniorityBonusShouldBePaid(e1);
        SeniorityBonusChecker.checkIfSeniorityBonusShouldBePaid(e2);
    }
}
