package com.sdacademy.innerclasses.classinclass;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printDescription() {
        System.out.println("Osoba: " + name + ", wiek: " + age);
    }

    public class FamilyDetails {
        private boolean isMarried;
        private int numberOfChildren;

        public FamilyDetails(boolean isMarried, int numberOfChildren) {
            this.isMarried = isMarried;
            this.numberOfChildren = numberOfChildren;
        }

        public void printDetails(){
            System.out.print("Szczegoly rodziny osoby "+name+ ": ");
            if (isMarried){
                System.out.print("W zwiazku malzenskim, ");
            }
            System.out.println(numberOfChildren+" dzieci");
        }
    }
}
