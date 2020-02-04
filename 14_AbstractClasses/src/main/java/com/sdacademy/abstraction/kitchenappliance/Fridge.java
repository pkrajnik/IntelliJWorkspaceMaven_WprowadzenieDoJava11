package com.sdacademy.abstraction.kitchenappliance;

public class Fridge extends KitchenAppliance {

    private byte minRefrigeratorTemperature;
    private byte minFreezerTemperature;

    public Fridge(String name, double weight, String energyClass, byte minRefrigeratorTemperature, byte minFreezerTemperature) {
        super(name, weight, energyClass);
        this.minRefrigeratorTemperature = minRefrigeratorTemperature;
        this.minFreezerTemperature = minFreezerTemperature;
    }

    public byte getMinRefrigeratorTemperature() {
        return minRefrigeratorTemperature;
    }

    public byte getMinFreezerTemperature() {
        return minFreezerTemperature;
    }

    @Override
    void description() {
        System.out.println("Lodowka "+ getName());
        System.out.println("Klasa energetyczna: "+ getEnergyClass());
        System.out.println("Ciezar: "+ getWeight());
        System.out.println("Minimalna temperatura chlodziarki: "+ minRefrigeratorTemperature);
        System.out.println("Minimalna temperatura zamrazarki: "+ minFreezerTemperature);
    }
}
