package com.kodilla.collections.lists;

import com.kodilla.collections.interfaces.Circle;
import com.kodilla.collections.interfaces.Shape;
import com.kodilla.collections.interfaces.Square;
import com.kodilla.collections.interfaces.Triangle;

import java.util.LinkedList;
import java.util.List;

public class GeneralShapesListApplication {

    public static void main(String[] args) {

        List<Shape> shapes = new LinkedList<>();
        Square square = new Square(20);     //aby użyć usówania obiektu musimy przypisac go do zmiennej tu square
        shapes.add(square);

        shapes.add(new Circle(7));
        shapes.add(new Triangle(10, 4, 10.77));

        shapes.remove(1);                   //usówamy po indeksie
        shapes.remove(square);                      // usówamy po obiekcie

        //Triangle triangle = new Triangle(10,4,10.77);   //usówmy po obiekcie który jest TAKI SAM (ma takie same parametry)
        //shapes.remove(triangle);                        // najpierw tworzymy go (parametry muszą być takie same jak w kolekcji a potem usówmy
        // ten sposób wymaga aby w klasie triangle była metoda equals (alt + Insert)

        shapes.remove(new Triangle(10, 4, 10.77));      //to samo co wyżej tylko krócej i bez tworzenia zmiennej

        System.out.println("Rozmiar kolekcji: " + shapes.size());

        for (Shape shape : shapes) {
            System.out.println(shape + " area: " + shape.getArea() + ", circumference: " + shape.getCircumference());
        }
    }
}
