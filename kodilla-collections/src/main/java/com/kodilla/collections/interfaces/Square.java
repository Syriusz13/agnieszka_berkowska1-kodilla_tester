package com.kodilla.collections.interfaces;

public class Square implements Shape {

    private double width;

    public Square(double width) {
        this.width = width;
    }

    public double getCircumference () {

        return 4 * width;
    }

    public double getArea () {

        return width * width;
    }
}
