package com.kodilla.bank.homework;

import com.kodilla.bank.homework.CashMachine;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CashMachineTestSuite {

    @Test
    public void arrayWillBeEmptyWhenIGiveNull () {          //sprawdzenie konstruktora

        //given
        double nullTable [] = null;

        //when
        CashMachine cashMachine = new CashMachine(nullTable);

        //then
        Assertions.assertNotNull(cashMachine.getTransactions());
        Assertions.assertEquals(0,cashMachine.getTransactions().length);
    }

    @Test
    public void shallReturnTheSameTableAsGivenInParameter () {      //sprawdzenie konstruktora

        //given
        double[] transactionTable  = new double[] {123};

        //when
        CashMachine cashMachine = new CashMachine(transactionTable);

        //then
        Assertions.assertArrayEquals(transactionTable, cashMachine.getTransactions());
    }

    @Test
    public void checkSaldo () {
        //given
        final double[] transactionTable  = new double[] {1,-2,3};
        final double expectedResult = 2;
        CashMachine cashMachine = new CashMachine(transactionTable);

        //when
        double saldo = cashMachine.getSaldo();

        //then
        Assertions.assertEquals(expectedResult, saldo);
    }

    @Test
    public void checkNumberOfTransaction () {
        final double[] transactionTable  = new double[] {1,-2,3};
        final int expectedResult = 3;
        CashMachine cashMachine = new CashMachine(transactionTable);

        double numberOfTransactions = cashMachine.howManyTransactions();

        Assertions.assertEquals(expectedResult, numberOfTransactions );

    }

    @Test
    public void checkHowManyDeposites () {
        final double[] transactionTable  = new double[] {-1,-2,-3};
        final int expectedResult = 0;
        CashMachine cashMachine = new CashMachine(transactionTable);

        double numberOfDeposites = cashMachine.howManyDeposits();

        Assertions.assertEquals(expectedResult, numberOfDeposites);

    }
}
