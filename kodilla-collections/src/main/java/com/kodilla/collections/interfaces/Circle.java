package com.kodilla.collections.interfaces;

public class Circle implements Shape{  //klasa Circle impelemntuje interfejs Shape

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getCircumference () {

        return 2 * Math.PI * radius;
    }

    public double getArea () {

        return Math.PI * radius * radius;
    }
}
