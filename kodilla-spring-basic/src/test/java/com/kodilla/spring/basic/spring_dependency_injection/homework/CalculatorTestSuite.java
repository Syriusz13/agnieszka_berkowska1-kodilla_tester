package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CalculatorTestSuite {

    private static Calculator bean;

    @BeforeAll
    public static void beforeAll () {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        bean = context.getBean(Calculator.class);
    }

    @Test
    public void shouldReturnCorrectSum() {
        Assertions.assertEquals(4, bean.add(2, 2));
    }

    @Test
    public void shouldReturnCorrectDifference() {
        Assertions.assertEquals(4, bean.substract(6, 2));
    }

    @Test
    public void shouldReturnCorrectProduct() {
         Assertions.assertEquals(4, bean.multiply(2, 2));
    }

    @Test
    public void shouldReturnCorrectQuotient() {
         Assertions.assertEquals(Double.POSITIVE_INFINITY, bean.divide(6, 0));
    }
}


