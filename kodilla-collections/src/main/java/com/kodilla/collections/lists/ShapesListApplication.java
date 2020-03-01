package com.kodilla.collections.lists;

import com.kodilla.collections.interfaces.Square;

import java.util.ArrayList;
import java.util.List;

public class ShapesListApplication {

    public static void main(String[] args) {
        List<Square> shapes = new ArrayList<>(); //typ zmiennej to List (interfejs); Square - to wskazanie jakiego typu obiekty będziemy
        //przechowywać w kolekcji (z klasy Square - coś jak parametr); shapes to nazwa zmiennej;
        //do zmiennej przypisujemy obiekt ArrayList; <> zostawiamy puste.
        shapes.add(new Square(10));        //dodajemy do kolekcji 3 nowo utworzone obiekty
        shapes.add(new Square(2));
        shapes.add(new Square(15));

        //każdą linijkę powyżej można zapisać w 2 krokach
        //Square sq1 = new Square (10);
        //shapes.add(sq1);
        //for (int n=0; n < shapes.size();n++){       // wyświetlenie wszystkich elementów kolekcji
        //    System.out.println(shapes.get(n));}      // - uwaga ! kolekcja ma wielkość size a nie długość lenght

        /*for (int n=0; n< shapes.size();n++) {         // wyświetla tylko elementy których pole jest większe niż 20
            Square square = shapes.get(n);
            if (square.getArea() > 20) {
                System.out.println(square + ", area:" + square.getArea());
            }
        }*/

        for (Square square : shapes) {              //to samo polecenie co na górze tylko pętlą foreach
            if (square.getArea() > 20) {
                System.out.println(square + ", area:" + square.getArea());
            }
        }
    }
}
