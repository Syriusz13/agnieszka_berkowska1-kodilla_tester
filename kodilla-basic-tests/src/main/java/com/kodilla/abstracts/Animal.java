package com.kodilla.abstracts;

public abstract class Animal {

    private int numberOfLegs;                           //zmienna

    public Animal (int numberOfLegs) {                  //konstruktor ??? nie do końca rozumiem po co on jest

        this.numberOfLegs = numberOfLegs;
    }

    public int getNumberOfLegs() {                      //getter

        return numberOfLegs;
    }

    public abstract void giveVoice();
}
