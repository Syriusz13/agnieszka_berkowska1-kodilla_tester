package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    @Test                                               //oznaczenie że to jest test
    public void testSum() {                             // metoda testująca sumowanie
        Calculator calculator = new Calculator();       // stworzenie obiektu
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);            // wywołanie metody z biblioteki JUnit
    }
}
