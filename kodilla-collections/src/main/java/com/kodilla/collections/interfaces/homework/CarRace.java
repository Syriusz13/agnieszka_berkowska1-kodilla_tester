package com.kodilla.collections.interfaces.homework;

public class CarRace {

    public static void main(String[] args) {

        Opel opel = new Opel(25, 10,10);
        Ford ford = new Ford(27, 10,10);
        Renault renault = new Renault(18, 10,10);

        System.out.println(doRace(opel));
        System.out.println(doRace(ford));
        System.out.println(doRace(renault));
    }

    public static int doRace (Car car) {

        car.getSpeed();
        car.decreaseSpeed();                // czy to powtarzanie da się jakość skrócić ?
        car.decreaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();

        return car.getSpeed();
    }

    public static int doRaceWithOneIncreace (Car car) {

        car.getSpeed();
        car.increaseSpeed();

        return car.getSpeed();
    }
}
