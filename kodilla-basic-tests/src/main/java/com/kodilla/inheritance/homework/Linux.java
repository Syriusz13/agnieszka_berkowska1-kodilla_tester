package com.kodilla.inheritance.homework;

public class Linux extends OperatingSystem {

    public Linux(int year) {
        super(year);
    }

    public void turnOn() {
        System.out.println("TurnOn Linux");
    }
    public void turnOff() {
        System.out.println("TurnOff Linux");
    }
}
