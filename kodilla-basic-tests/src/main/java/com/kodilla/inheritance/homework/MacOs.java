package com.kodilla.inheritance.homework;

public class MacOs extends OperatingSystem {

    public MacOs(int year) {
        super(year);
    }

    public void turnOn() {
        System.out.println("TurnOn MacOS");
    }
    public void turnOff() {
        System.out.println("TurnOff MacOS");
    }
}
