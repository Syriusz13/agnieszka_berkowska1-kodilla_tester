package com.kodilla.bank.homework;

import java.util.Objects;

public class Bank {

    CashMachine[] cashMachines;

    public Bank(CashMachine[] cashMachines) {

        if (Objects.isNull(cashMachines)) {
            this.cashMachines = new CashMachine[]{};
        } else {
            this.cashMachines = cashMachines;
        }
    }

    public double bilans() {
        double bilans = 0;

        for (CashMachine cashmashine:cashMachines) {            //dla każdego cashmashine w zmiennej cashmashines
            bilans = bilans + cashmashine.getSaldo();
        }

        return bilans;
    }

    public int countPayouts() {
            int numberOfPayouts = 0;

        for (CashMachine cashmashine:cashMachines) {            //dla każdego cashmashine w zmiennej cashmashines

            numberOfPayouts += cashmashine.howManyPayouts();
        }

        return numberOfPayouts;
    }

    public int countDeposits() {
            int numberOfDeposits = 0;

        for (CashMachine cashmashine:cashMachines) {            //dla każdego cashmashine w zmiennej cashmashines

            numberOfDeposits += cashmashine.howManyDeposits();
        }

        return numberOfDeposits;
    }

    private double bilansOfPayouts() {
        double balance = 0;

        for (CashMachine cashmashine:cashMachines) {

           balance += cashmashine.sumOfPayouts();
        }

        return balance;
    }

    private double bilansOfDeposits() {
        double balance = 0;

        for (CashMachine cashmashine:cashMachines) {

            balance += cashmashine.sumOfDeposits();
        }

        return balance;
    }

    public double avgDeposit () {
        double avg = 0;
        int countOfDeposit = countDeposits();
        if (countOfDeposit != 0) {
            avg = bilansOfDeposits()/countDeposits();
        }

        return avg;
    }

    public double avgPayout () {
        double avg = 0;

        int countOfPayout = countPayouts();
        if (countOfPayout != 0) {
            avg = bilansOfPayouts()/countPayouts();
        }

        return avg;
    }
}
