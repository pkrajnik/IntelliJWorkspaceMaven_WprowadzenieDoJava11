package com.sdacademy.enums.automobile;

public class Automobile {

    private final AutomobileType type;
    private String name;

    public Automobile(AutomobileType type, String name) {
        this.type = type;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Automobile{" +
                "type=" + type +
                ", name='" + name + '\'' +
                '}';
    }
}
