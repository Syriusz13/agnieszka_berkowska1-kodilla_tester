package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {

    private double a = 5;
    private  double b = 4;

    @Override
    public double surfaceArea() {
        double area = a * b;
        return area;
    }

    @Override
    public double perimeter() {
        double perimeter = 2*a + 2*b;
        return perimeter;
    }

    @Override
    public void result() {

    }
}
