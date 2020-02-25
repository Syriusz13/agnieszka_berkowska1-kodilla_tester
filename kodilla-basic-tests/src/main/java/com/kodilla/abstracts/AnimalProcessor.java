package com.kodilla.abstracts;

public class AnimalProcessor {

    public void process (Animal animal) {               //typ jako argument = każdy obiekt który dziedziczy po Animal

        System.out.println("Animal has " + animal.getNumberOfLegs() + " legs");

        animal.giveVoice();
    }
}
