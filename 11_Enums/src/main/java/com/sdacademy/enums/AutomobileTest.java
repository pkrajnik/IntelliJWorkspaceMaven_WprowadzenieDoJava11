package com.sdacademy.enums;

import com.sdacademy.enums.automobile.Automobile;
import com.sdacademy.enums.automobile.AutomobileType;

public class AutomobileTest {

    public static void main(String[] args) {
        Automobile fiat = new Automobile(AutomobileType.CAR, "Fiat Uno");
        Automobile star = new Automobile(AutomobileType.TRUCK, "Star 200");

        System.out.println(fiat);
        System.out.println(star);

    }
}
