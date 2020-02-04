package com.sdacademy.abstraction.kitchenappliance;

public abstract class KitchenAppliance {
    String name;
    double weight;
    String energyClass;

    public KitchenAppliance(String name, double weight, String energyClass) {
        this.name = name;
        this.weight = weight;
        this.energyClass = energyClass;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public String getEnergyClass() {
        return energyClass;
    }

    abstract void description();
}
