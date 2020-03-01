package com.kodilla.collections.interfaces;

public class Triangle implements Shape {

    public Triangle(double width, double height, double hypotenuse) {
        this.width = width;
        this.height = height;
        this.hypotenuse = hypotenuse;
    }

    double width;                       //podtsrawa
    double height;                      //wysokość
    double hypotenuse;                  //przeciwprostokątna


    @Override
    public double getArea() {
        return width * (hypotenuse/2);
    }

    @Override
    public double getCircumference() {
        return width + height + hypotenuse;
    }
}
