package com.sdacademy.inheritance.person;

public class Student extends Person {

    String university;
    String indexId;

    public Student(String firstName, String lastName, int age, String university, String indexId) {
        super(firstName, lastName, age);
        this.university = university;
        this.indexId = indexId;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getIndexId() {
        return indexId;
    }

    public void setIndexId(String indexId) {
        this.indexId = indexId;
    }

    @Override
    public void description(){
        System.out.println("Nazywam się "+ getFirstName()+" "+ getLastName());
        System.out.println("Jestem studentem uczelni" + university);
        System.out.println("Mój numer indeksu to:" + indexId);
    }

}
