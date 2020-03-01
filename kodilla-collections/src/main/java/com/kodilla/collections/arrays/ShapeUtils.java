package com.kodilla.collections.arrays;

import com.kodilla.collections.interfaces.Triangle;
import com.kodilla.collections.interfaces.Circle;
import com.kodilla.collections.interfaces.Square;
import com.kodilla.collections.interfaces.Shape;

public class ShapeUtils {
    private static void displayShapeInfo (Shape shape) {
        System.out.println(".....................................");
        System.out.println("Shape kind: " + getShapeName(shape));
        System.out.println("Shape area: " + shape.getArea());
        System.out.println("Shape circumference: " + shape.getCircumference());
    }

    private  static  String getShapeName (Shape shape) {
        if (shape instanceof Circle)
            return "Circle";
        else if (shape instanceof Triangle)
            return "Triangle";
        else if (shape instanceof Square)
            return "Square";
        else
            return "Unknown shape name.";
    }
}

/* ta klasa nie posiaa żadnych pól (iejsc gdzie może zapisywać stany obiektów tzw. klasa bezstanowa
może zawierać tylko metody statyczne
 */