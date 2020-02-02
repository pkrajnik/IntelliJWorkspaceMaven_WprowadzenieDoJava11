package com.sdacademy.methodoverride;

public class ManagedContentWebsite extends DynamicWebsite {

    private int numberOfManagedContentTypes; //np:artykoly, wpisy...

    public ManagedContentWebsite(int numberOfPages, int numberOfPhotos, int numberOfManagedContentTypes) {
        super(numberOfPages, numberOfPhotos);
        this.numberOfManagedContentTypes = numberOfManagedContentTypes;
    }

    public int getNumberOfManagedContentTypes() {
        return numberOfManagedContentTypes;
    }

    double calculatePrice() {
        return (150 * numberOfPages + 50 * numberOfPhotos) * 5 * numberOfManagedContentTypes;
    }
}
