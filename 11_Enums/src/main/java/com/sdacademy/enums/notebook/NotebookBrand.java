package com.sdacademy.enums.notebook;

public enum NotebookBrand {
    ACER(3), LENOVO(5), HP(7);

    private int reliability;

    NotebookBrand(int reliability) {
        this.reliability = reliability;
    }

    public int getReliability() {
        return reliability;
    }
}
