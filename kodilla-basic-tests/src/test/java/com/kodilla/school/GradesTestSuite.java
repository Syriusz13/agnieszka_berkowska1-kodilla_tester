package com.kodilla.school;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GradesTestSuite {

    @Test
    public void shouldHaveZeroLength() {                //test czt tablica jest pusta
        Grades grades = new Grades();
        int[] values = grades.getValues();
        assertEquals(0, values.length);
    }

    @Test
    public void shouldAddTwoElementsToArray() {     //czy jak dodamy 2 wartości to jest ok
        Grades grades = new Grades();
        grades.add(4);                                 //dodajemy 2 wartości do tablicy
        grades.add(2);

        int[] values = grades.getValues();
        assertEquals(2, values.length);        // oczekujemy 2 na ostatnim miejscu tablicy
        assertEquals(4, values[0]);             // oczekujemy 4 na ) miejscu tablicy
        assertEquals(2, values[1]);             // oczekujemy 2 na 1 miejscu tablicy
    }

    @Test
    public void shouldCalculateAverage() {
        Grades grades = new Grades();
        grades.add(4);
        grades.add(2);
        grades.add(5);

        assertEquals(3.66, grades.getAverage(), 0.01);

        //assertEquals przyjmującej trzy argumenty:
        // wartość oczekiwana, wartość obliczona oraz delta. Podanie delty - dopuszczalnej różnicy między wartością
        // oczekiwaną, a otrzymaną – jest konieczne. W Javie, operacje na liczbach zmiennoprzecinkowych są nieprecyzyjne.

    }

    @Test
    public void shouldReturnAverageEqualsZeroIsArrayIsEmpty() {     //sprawdzamy czy przy braku ocen zwróci nam średnią zero
        Grades grades = new Grades();
        assertEquals(0, grades.getAverage(), 0.0001);
    }
}