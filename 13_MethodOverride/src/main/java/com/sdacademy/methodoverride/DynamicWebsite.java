package com.sdacademy.methodoverride;

public class DynamicWebsite extends BasicWebsite {

    public DynamicWebsite(int numberOfPages, int numberOfPhotos) {
        super(numberOfPages, numberOfPhotos);
    }

    double calculatePrice() {
        return 150 * numberOfPages + 50 * numberOfPhotos;
    }
}
