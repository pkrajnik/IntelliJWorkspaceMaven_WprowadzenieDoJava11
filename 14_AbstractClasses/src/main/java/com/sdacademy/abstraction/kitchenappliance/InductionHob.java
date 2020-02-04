package com.sdacademy.abstraction.kitchenappliance;

public class InductionHob extends KitchenAppliance {

    private int NumberOfInductionFields;
    private boolean booster;

    public InductionHob(String name, double weight, String energyClass, int NumberOfInductionFields, boolean booster) {
        super(name, weight, energyClass);
        this.NumberOfInductionFields = NumberOfInductionFields;
        this.booster = booster;
    }

    public int getNumberOfInductionFields() {
        return NumberOfInductionFields;
    }

    public boolean isBooster() {
        return booster;
    }

    @Override
    void description() {
        System.out.println("Plyta indukcyjna "+ getName());
        System.out.println("Ilosc pol indukcyjnych: "+ NumberOfInductionFields);
        System.out.print("Funkcja booster :");
        if(booster){
            System.out.println("TAK");
        }
        else
        {
            System.out.println("NIE");
        }
    }
}
