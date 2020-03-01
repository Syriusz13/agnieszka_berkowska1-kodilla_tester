package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PrimeCheckerTestSuite {

    private PrimeChecker checker = new PrimeChecker();  // zapis powodujący że w każdym teście zostanie utworzony obiekt checker
    private static int count = 0;                          // zmienna zapisująca numer testu (zmienna musi być statyczna,
                                                            // aby była zliczana pomiędzy obiektami (należy do klasy a nie obiektu)

    @Test
    public void shouldReturnFalseWhenPassingNotPrimeNumber() {
        //PrimeChecker checker = new PrimeChecker();     zamiast pisać w każdym teście obiekt wrzuciliśmy go na górę przed testy
        boolean result = checker.isPrime(14);
        count++;                                        // +1 do numeru testu
        System.out.println("Test number " + count);     // wyświetlenie info o numerze testu
        assertFalse(result);
    }

    @Test
    public void shouldReturnTrueWhenPassingPrimeNumber() {
        //PrimeChecker checker = new PrimeChecker();
        boolean result = checker.isPrime(13);
        count++;
        System.out.println("Test number " + count);
        assertTrue(result);
    }

    @Test
    public void shouldReturnTrueWhenPassingTwo() {
        //PrimeChecker checker = new PrimeChecker();
        boolean result = checker.isPrime(2);
        count++;
        System.out.println("Test number " + count);
        assertTrue(result);
    }

    @Test
    public void shouldReturnFalseWhenPassingOne() {
        //PrimeChecker checker = new PrimeChecker();
        boolean result = checker.isPrime(1);
        count++;
        System.out.println("Test number " + count);
        assertFalse(result);
    }

    @Test
    public void shouldReturnFalseWhenPassingZero() {
        //PrimeChecker checker = new PrimeChecker();
        boolean result = checker.isPrime(0);
        count++;
        System.out.println("Test number " + count);
        assertFalse(result);
    }

    @Test
    public void shouldReturnFalseWhenPassingNegativeNumber() {
        //PrimeChecker checker = new PrimeChecker();
        boolean result = checker.isPrime(-6);
        count++;
        System.out.println("Test number " + count);
        assertFalse(result);
    }
}
