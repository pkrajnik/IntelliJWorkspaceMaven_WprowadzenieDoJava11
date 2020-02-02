package com.sdacademy.methodoverride;

public class BasicWebsite {

    int numberOfPages;
    int numberOfPhotos;

    public BasicWebsite(int numberOfPages, int numberOfPhotos) {
        this.numberOfPages = numberOfPages;
        this.numberOfPhotos = numberOfPhotos;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public int getNumberOfPhotos() {
        return numberOfPhotos;
    }

    public void setNumberOfPhotos(int numberOfPhotos) {
        this.numberOfPhotos = numberOfPhotos;
    }

    double calculatePrice() {
        return 80 * numberOfPages + 50 * numberOfPhotos;
    }

    @Override
    public String toString() {
        return "Cena strony wynosi:" + calculatePrice();
    }
}
