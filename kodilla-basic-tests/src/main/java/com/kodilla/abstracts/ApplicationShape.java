package com.kodilla.abstracts;

import com.kodilla.abstracts.homework.Circle;
import com.kodilla.abstracts.homework.Rectangle;
import com.kodilla.abstracts.homework.Square;

public class ApplicationShape {

    public static void main(String[] args) {        //wiem że kod jest brzydki - za dużo powtórzeń, działa ??? jak skrócić

        Circle circle = new Circle();

        System.out.println(" Circle surfaced area = " + circle.surfaceArea());
        System.out.println(" Circle perimeter = " + circle.perimeter());


        Square square = new Square();

        System.out.println(" Square surfaced area = " + square.surfaceArea());
        System.out.println(" Square perimeter = " + square.perimeter());


        Rectangle rectangle = new Rectangle();

        System.out.println(" Rectangle surfaced area = " + rectangle.surfaceArea());
        System.out.println(" Rectangle perimeter = " + rectangle.perimeter());

    }

}
