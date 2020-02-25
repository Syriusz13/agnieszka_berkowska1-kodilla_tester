package com.kodilla.abstracts.homework;

public class Circle extends Shape {

    private double radius = 5;

    @Override
    public double surfaceArea() {
        double area = 3.14*radius*radius;
        return area;
    }

    @Override
    public double perimeter() {
        double perimeter = 2*3.14*radius;
        return perimeter;
    }

    @Override
    public void result() {

    }
}
