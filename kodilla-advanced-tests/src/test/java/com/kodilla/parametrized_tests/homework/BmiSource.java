package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class BmiSource {
    static Stream<Arguments> provideDoubleForTestingBmi() {
        return Stream.of(
                Arguments.of(new Person(1.75,40),"Very severely underweight"), //<15
                Arguments.of(new Person(1.75,48),"Severely underweight"), //<16
                Arguments.of(new Person(1.75,55),"Underweight"), //<18,5
                Arguments.of(new Person(1.75, 65),"Normal (healthy weight)"), //<25
                Arguments.of(new Person(1.75, 80),"Overweight"), //<30
                Arguments.of(new Person(1.75, 100),"Obese Class I (Moderately obese)"), //<35
                Arguments.of(new Person(1.75, 120),"Obese Class II (Severely obese)"), //<40
                Arguments.of(new Person(1.75, 130),"Obese Class III (Very severely obese)"), //<45
                Arguments.of(new Person(1.75, 140),"Obese Class IV (Morbidly Obese)"), //<50
                Arguments.of(new Person(1.75, 160),"Obese Class V (Super Obese)"), // <60
                Arguments.of(new Person(1.5, 300),"Obese Class VI (Hyper Obese)") //>=60
            );
        }
}
