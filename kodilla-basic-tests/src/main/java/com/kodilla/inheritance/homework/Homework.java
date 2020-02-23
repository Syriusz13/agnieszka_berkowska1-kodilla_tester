package com.kodilla.inheritance.homework;

public class Homework {

    public static void main(String[] args) {

        OperatingSystem os = new OperatingSystem(2020);
        os.turnOn();
        os.turnOff();

        Linux linux = new Linux(1999);        //czy muszę robić nowy obiekt czy mogę jakoś wykorzystać os ???
        linux.turnOn();
        linux.turnOff();

        MacOs macOs = new MacOs(1410);
        macOs.turnOn();
        macOs.turnOff();

    }
}
