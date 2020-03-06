package com.sdacademy.listsorted;

public class Movie implements Comparable<Movie>{

    private String title;
    private int yearOfProduction;

    public Movie(String title, int yearOfProduction) {
        this.title = title;
        this.yearOfProduction = yearOfProduction;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    @Override
    public String toString() {
        return "Movie{ title=" + title + ", yearOfProduction=" + yearOfProduction + "}";
    }

    @Override
    public int compareTo(Movie o) {
        return this.title.compareTo(o.title);
    }
}
