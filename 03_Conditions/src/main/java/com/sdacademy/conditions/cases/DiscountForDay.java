package com.sdacademy.conditions.cases;

public class DiscountForDay {

    public static void main(String args[]) {

        String day = "Wednessday";
        double regularPrice = 120;
        double discount = 0;

        switch (day) {
            case "Monday":
                discount=0.1;
                System.out.println("Discount for Monday: "+discount*100+"%");
                break;
            case "Wednessday":
                discount=0.2;
                System.out.println("Discount for Wednessday: "+discount*100+"%");
                break;
            case "Tuesday":
                discount=0.3;
                System.out.println("Discount for Tuesday: "+discount*100+"%");
                break;
            default:
                discount=0;
                System.out.println("Today no discount. "+discount*100+"%");
                break;
        }

        double discountedPrice = regularPrice - regularPrice * discount;

        System.out.println("Your item will cost You: "+discountedPrice);
    }
}
