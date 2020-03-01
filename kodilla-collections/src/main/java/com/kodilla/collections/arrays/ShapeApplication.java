package com.kodilla.collections.arrays;

import com.kodilla.collections.interfaces.Circle;
import com.kodilla.collections.interfaces.Shape;
import com.kodilla.collections.interfaces.Square;
import com.kodilla.collections.interfaces.Triangle;

import java.util.Random;

public class ShapeApplication {

    public static void main(String[] args){
        Shape[] shapes = new Shape[5];

        for (int i = 0; i < shapes.length; i++)
            shapes[i] = drawShape();

    }

    private static Shape drawShape () {

        Random random = new Random();
        int drawnShapeKind = random.nextInt(3);         //wylosowanie liczby w zakresie od 0 do 2 (3-1)
        double a = random.nextDouble() * 100 + 1;               //next.Double wylosowaliśmy trzy liczby (a, b, c) o wartościach typu double z zakresu od 1 do 100.999
        double b = random.nextDouble() * 100 + 1;
        double c = random.nextDouble() * 100 + 1;

        if (drawnShapeKind == 0)                                //jeżeli wyszło 0 to zwróć koło z wymiarami a
            return new Circle(a);
        else if (drawnShapeKind == 1)
            return new Square(a);
        else
            return new Triangle(a, b, c);
    }
}
