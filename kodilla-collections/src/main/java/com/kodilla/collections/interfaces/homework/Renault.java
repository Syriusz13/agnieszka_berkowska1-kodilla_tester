package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

public class Renault implements Car {

    private int speed;
    private int increaseSpeed;
    private int decreaseSpeed;

    public Renault(int speed, int increaseSpeed, int decreaseSpeed) {
        this.speed = speed;
        this.increaseSpeed = increaseSpeed;
        this.decreaseSpeed = decreaseSpeed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed = speed + increaseSpeed;
    }

    @Override
    public void decreaseSpeed() {
        speed = speed - decreaseSpeed;
    }

    @Override
    public String toString() {
        return "Renault{" +
                "speed=" + speed +
                ", increaseSpeed=" + increaseSpeed +
                ", decreaseSpeed=" + decreaseSpeed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Renault renault = (Renault) o;
        return speed == renault.speed &&
                increaseSpeed == renault.increaseSpeed &&
                decreaseSpeed == renault.decreaseSpeed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed, increaseSpeed, decreaseSpeed);
    }
}
