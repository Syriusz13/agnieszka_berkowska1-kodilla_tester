package com.kodilla.school;

public class Grades {

    private int[] values;               // tablica ocen
    private int size;                   // zmienna konieczna d tworzenia tablicy o 1 większej od poprzedniej

    public Grades() {                   // konstruktor
        this.size = 0;
        this.values = new int[0];
    }

    public void add(int value) {           // metoda zwiększająca wielkość tablicy o 1 i przepisująca wartości poprzedniej tablicy
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(values, 0, newTab, 0, values.length);
                        //skopiowanie tablicy źródłowej do tablicy docelowej, zachowując obecny układ elementów
        newTab[this.size - 1] = value;      //przypisujemy nową wartość do ostatniego elementu w tablicy
        this.values = newTab;               //przypisanie nowo utworzonej tablicy do tablicy przechowywanej w klasie
    }

    public int[] getValues() {              //????
        return values;
    }

    public double getAverage() {        //zwraca średnią ocen

        if (this.values.length == 0) {
            return 0;
        }
        double sum = 0;
        for(int i = 0; i < this.values.length; i++) {
            sum += this.values[i];
        }
        return sum/this.values.length;
    }
}
