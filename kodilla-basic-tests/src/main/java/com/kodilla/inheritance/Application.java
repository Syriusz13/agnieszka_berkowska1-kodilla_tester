package com.kodilla.inheritance;

import org.w3c.dom.ls.LSOutput;

public class Application {

    public static void main(String[] args) {

        Car car = new Car();
        car.turnOnLights();

        Convertible convertible = new Convertible();
        convertible.turnOnLights();
    }

}
