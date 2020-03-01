package com.kodilla.collections.interfaces;

public class InterfacesDemo {

    public static void main(String[] args) {

        Square square = new Square (10);
        showShapeDetails (square);

        Circle circle = new Circle(7);
        showShapeDetails (circle);

        Triangle triangle = new Triangle(3, 4, 5);
        showShapeDetails (triangle);
    }

    private  static void showShapeDetails (Shape shape) {           // do tej metody możemy przypisać obiekt dowolnej klasy impementujące Shape

        System.out.println(shape.getCircumference());
        System.out.println(shape.getCircumference());

    }

    /*private static void showSquareDetails (Square square) {       //zamiast tego dajemy jedną metodę używającą interfejsu Shape
        System.out.println(square.getCircumference());              //
        System.out.println(square.getArea());
    }

    private static void showCircleDetails (Circle circle) {
        System.out.println(circle.getCircumference());
        System.out.println(circle.getArea());
    }

    private static void showTriangleDetails (Triangle triangle) {
        System.out.println(triangle.getCircumference());
        System.out.println(triangle.getArea());
    }*/
}
