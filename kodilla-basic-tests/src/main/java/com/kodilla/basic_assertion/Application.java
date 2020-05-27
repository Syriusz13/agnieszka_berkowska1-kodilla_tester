package com.kodilla.basic_assertion;

public class Application {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();       // tworzymy obiekt aby wywołać na nim metodę
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);   // tworzymy nową zmienną liczącą sumę (wywołanie metody na obiekcie)
        boolean correctSum = ResultChecker.assertEquals(13, sumResult);    //tworzymy zmienną gdzie
                                                //wywołujemy metodę, której argumentem jest wynik kolejnej metody
        if (correctSum = true) {

            System.out.println("Sumowanie działa poprawnie dla liczb " + a + " i " + b);

        } else {

            System.out.println("Sumowanie nie działa poprawnie dla liczb " + a + " i " + b);
        }

        int subtractResult = calculator.substract(a, b);
        boolean correctSubtract = ResultChecker.assertEquals(-3, subtractResult);

        if (correctSubtract = true) {

            System.out.println("Odejmowanie działa poprawnie dla liczb " + a + " i " + b);

        } else {

            System.out.println("Odejmowanie nie działa poprawnie dla liczb " + a + " i " + b);
        }

        int squaredResult = calculator.squared(a);

        boolean correctSquared = ResultChecker.assertEquals(25, squaredResult);

        if (correctSquared = true) {

            System.out.println("Podnoszenie do kwadratu działa poprawnie dla liczby " + a);

        } else {

            System.out.println("Podnoszenie do kwadratu nie działa poprawnie dla liczby " + a);
        }
    }
}
