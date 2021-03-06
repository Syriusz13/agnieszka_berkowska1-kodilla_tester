package com.kodilla.collections.interfaces;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }
}
