package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class GamblingMachineTestSuite {

    GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/gamblingMachineTrue.csv", numLinesToSkip = 0)
    public void gamblingSuccessTest(Integer num1, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6)
            throws InvalidNumbersException {
        Set<Integer> userNumbers = Set.of(num1, num2, num3,num4,num5,num6);

        int result = gamblingMachine.howManyWins(userNumbers);

        Assertions.assertTrue(result>=0 && result <=6);
    }

    @ParameterizedTest
    @CsvFileSource(resources="/gamblingMachineFalse.csv",numLinesToSkip = 0)
    public void gamblingFailTest(Integer num1, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7) {
        Set<Integer> userNumbers = new HashSet<Integer>();
        Optional.ofNullable(num1).ifPresent(userNumbers::add); //if (num1 != null) {userNumbers.add(num1);} - to jest to samo a jakoś logiczniej
        Optional.ofNullable(num2).ifPresent(userNumbers::add);
        Optional.ofNullable(num3).ifPresent(userNumbers::add);
        Optional.ofNullable(num4).ifPresent(userNumbers::add);
        Optional.ofNullable(num5).ifPresent(userNumbers::add);
        Optional.ofNullable(num6).ifPresent(userNumbers::add);
        Optional.ofNullable(num7).ifPresent(userNumbers::add);

        Assertions.assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(userNumbers));
    }
}
