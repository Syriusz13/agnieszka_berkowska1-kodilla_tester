package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PersonTestSuite {

   @ParameterizedTest
   @MethodSource(value = "com.kodilla.parametrized_tests.homework.BmiSource#provideDoubleForTestingBmi")
   public void shouldCalculatePersonBMI (Person testedPerson, String  expectedResult) {
       Assertions.assertEquals(expectedResult, testedPerson.getBMI());
   }
}
