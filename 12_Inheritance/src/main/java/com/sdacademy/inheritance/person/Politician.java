package com.sdacademy.inheritance.person;

public class Politician extends Person {

    String party;

    public Politician(String firstName, String lastName, int age, String party) {
        super(firstName, lastName, age);
        this.party = party;
    }

    public String getParty() {
        return party;
    }

    public void setParty(String party) {
        this.party = party;
    }

    @Override
    public void description(){
        System.out.println("Nazywam się "+ getFirstName()+" "+ getLastName());
        System.out.println("Jestem politykiem partii" + party);
    }
}
