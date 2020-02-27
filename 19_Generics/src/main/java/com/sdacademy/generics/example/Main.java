package com.sdacademy.generics.example;

public class Main {

    public static void main(String[] args) {

        //osobne pudelka na gruszki i jablka - redundancja kodu
        BoxForPears boxForPears = new BoxForPears(new Pear("gruszka1"));
        BoxForApples boxForApples = new BoxForApples(new Apple("jablko1"));
        System.out.println(boxForPears.getPear().getPearName());
        System.out.println(boxForApples.getApple().getAppleName());

        //pudelko na obiekty - potrzebne rzutowanie
        BoxForObjects boxForPears2 = new BoxForObjects(new Pear("gruszka2"));
        BoxForObjects boxForApples2 = new BoxForObjects(new Apple("jablko2"));
        System.out.println(((Pear)boxForPears2.getObj()).getPearName());
        System.out.println(((Apple)boxForApples2.getObj()).getAppleName());

        //bez redundancji i bez rzutowania
        BoxForGenericFruits<Pear> boxForPears3 =
                new BoxForGenericFruits<>(new Pear("gruszka3"));
        BoxForGenericFruits<Apple> boxForApples3 =
                new BoxForGenericFruits<>(new Apple("jablko3"));
        System.out.println(boxForPears3.getFruit().getPearName());
        System.out.println(boxForApples3.getFruit().getAppleName());


    }
}
