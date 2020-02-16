package com.sdacademy.interfaces;

import com.sdacademy.interfaces.phones.Camera;
import com.sdacademy.interfaces.phones.Computer;
import com.sdacademy.interfaces.phones.MobilePhone;
import com.sdacademy.interfaces.phones.Phone;

public class Main {

    public static void main(String[] args) {

        MobilePhone mobilePhone = new MobilePhone(); //Tworzymy doslowny obiekt typu MobilePhone
        mobilePhone.runApplication();
        mobilePhone.call();
        mobilePhone.takePhoto();

        //Tworzymy implementer interfejsu Camera, dostepna metoda takePhoto
        //Gdybysmy mieli wiecej klas implementujacych interfejs Camera, to pod zmienna camera
        //moglibysmy podpiac ktorakolwiek z nich
        Camera camera = new MobilePhone();
        camera.takePhoto();

        Phone mobilePhone2 = new MobilePhone();
        mobilePhone2.call();

        Computer computer = new MobilePhone();
        computer.runApplication();

    }
}
