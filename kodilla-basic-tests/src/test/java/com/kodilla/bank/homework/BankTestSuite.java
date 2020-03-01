package com.kodilla.bank.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BankTestSuite {

    @Test
    public void checkBilans () {

        //given
        Bank bank = prepareBank();

        final double expectedResult = 62;

        //when
        double bilans = bank.bilans();

        //then
        Assertions.assertEquals(expectedResult, bilans);
    }

    @Test
    public void checkBilansIsNoCashmashines () {

        //given
        Bank bank = new Bank(null);

        final double expectedResult = 0;

        //when
        double bilans = bank.bilans();

        //then
        Assertions.assertEquals(expectedResult, bilans);
    }

    @Test
    public void checkCountPayouts () {
        Bank bank = prepareBank();

        final int expectedResult = 2;

        //when
        int numberOfPayouts = bank.countPayouts();

        //then
        Assertions.assertEquals(expectedResult, numberOfPayouts);
    }

    @Test
    public void checkCountPayoutsWhenBankIsNull () {
        Bank bank = new Bank(null);

        final int expectedResult = 0;

        //when
        int numberOfPayouts = bank.countPayouts();

        //then
        Assertions.assertEquals(expectedResult, numberOfPayouts);
    }

    @Test
    public void checkCountDeposits () {
        Bank bank = prepareBank();

        final int expectedResult = 2;

        //when
        int numberOfPDeposits = bank.countDeposits();

        //then
        Assertions.assertEquals(expectedResult, numberOfPDeposits);
    }

    @Test
    public void checkCountDepositsWhenBankIsNull () {
        Bank bank = new Bank(null);

        final int expectedResult = 0;

        //when
        int numberOfDeposits = bank.countDeposits();

        //then
        Assertions.assertEquals(expectedResult, numberOfDeposits);
    }

    @Test
    public void checkAvgPayout () {
        Bank bank = prepareBank();

        final double expectedResult = -20;

        double avg = bank.avgPayout();

        Assertions.assertEquals(expectedResult, avg);
    }

    @Test
    public void checkAvgPayoutWhenBankIsNull () {           // z punktu widzenia matmy oczekiwana nie jest 0 boo wartość średniej = 0 to też wartość a tu nie mamy średniej
        Bank bank = new Bank(null);

        final double expectedResult = 0;

        double avg = bank.avgPayout();

        Assertions.assertEquals(expectedResult, avg);
    }

    @Test
    public void checkAvgDeposit () {
        Bank bank = prepareBank();

        final double expectedResult = 51;

        double avg = bank.avgDeposit();

        Assertions.assertEquals(expectedResult, avg, 0.01);
    }

    @Test
    public void checkAvgDepositWhenBankIsNull () {

        Bank bank = new Bank(null);

        final double expectedResult = 0;

        double avg = bank.avgDeposit();

        Assertions.assertEquals(expectedResult, avg);
    }


    private Bank prepareBank () {                   // bank do celów obliczeń - z transakcjami
        return new Bank(
                new CashMachine[]{
                        new CashMachine(new double[]{-10, 2, 0}),
                        new CashMachine(new double[]{100, -30, 0}),
                        new CashMachine(new double[]{})
                }
        );

    }
}
