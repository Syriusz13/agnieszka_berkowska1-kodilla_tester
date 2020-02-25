package com.kodilla.abstracts.homework;

public class Square extends Shape{

    private double a = 5;

    @Override
    public double surfaceArea() {
        double area = a * a;
        return area;
    }

    @Override
    public double perimeter() {
        double perimeter = 4 * a;
        return perimeter;
    }

    @Override
    public void result() {

    }
}
