package com.sdacademy.methodoverride;

public class Main {

    public static void main(String[] args) {
        BasicWebsite businessCardWebsite = new BasicWebsite(3, 5);
        BasicWebsite phpWebsite = new DynamicWebsite(7, 15);
        BasicWebsite newsPortal = new ManagedContentWebsite(7, 15, 3);

        System.out.println("Wizytowka "+businessCardWebsite);
        System.out.println("Strona w PHP: "+phpWebsite);
        System.out.println("Informacyjny portal internetowy: "+newsPortal);
    }
}
