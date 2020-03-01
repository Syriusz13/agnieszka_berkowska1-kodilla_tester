package com.kodilla.bank.homework;

import java.util.Objects;

public class CashMachine {

    private double[] transactions;              // deklarujemy tablice transakcje
    //private int size;

    public CashMachine (double transactions[]) { //tworzymy konstruktor
        if (Objects.isNull(transactions)) {
            this.transactions = new double[0];      //dodajemy informacje aby w wynikach nie wyszedł null
        } else {
            this.transactions = transactions;
        }
        //this.size = 0;
    }

    public double[] getTransactions() {
        return transactions;
    }

    /*public void add(double value) {           // metoda zwiększająca wielkość tablicy o 1 i przepisująca wartości poprzedniej tablicy
        this.size++;
        double[] newTab = new double[this.size];
        System.arraycopy(transactions, 0, newTab, 0, transactions.length);
                                            //skopiowanie tablicy źródłowej do tablicy docelowej, zachowując obecny układ elementów
        newTab[this.size - 1] = value;      //przypisujemy nową wartość do ostatniego elementu w tablicy
        this.transactions = newTab;         //przypisanie nowo utworzonej tablicy do tablicy przechowywanej w klasie
    }*/

    public double getSaldo() {        //zwraca saldo z bankomatu
        double saldo = 0;

        for(int i = 0; i < transactions.length; i++) {
            saldo = saldo + transactions[i];
        }

        return saldo;
    }

    public int howManyTransactions() {      //Zwraca liczbe transakcji

        int numberOfTransactions = transactions.length;

        return numberOfTransactions;
    }

    public int howManyDeposits () {                         // sprawdziłam z ujemnymi dalej do zrobienia
        int numberOfDeposits = 0;

        for(int i = 0; i < transactions.length; i++) {

            if (this.transactions[i]>0) {
                numberOfDeposits++;
            }
        }

        return numberOfDeposits;
    }

    public int howManyPayouts () {
        int numberOfPayouts = 0;

        for(int i = 0; i < transactions.length; i++) {

            if (transactions[i]<0) {
                numberOfPayouts++;
            }
        }
        return numberOfPayouts;
    }

    public double sumOfDeposits () {
        double sum = 0;

        for (int i = 0; i < transactions.length; i++) {

            if (transactions[i] > 0) {

                sum = sum + transactions[i];
            }
        }
            return sum;

    }

    public double sumOfPayouts() {
            double sum = 0;

            for (int i = 0; i < transactions.length; i++) {

                if (transactions[i] < 0) {

                    sum = sum + transactions[i];
                }
            }
                return sum;

     }
}




