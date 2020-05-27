package com.kodilla.spring.basic.spring_dependency_injection.homework;

import com.kodilla.spring.basic.spring_dependency_injection.SkypeMessageService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class ShippingCenterTestSuite {

    private static ShippingCenter bean;

    @BeforeAll
    public static void beforeAll () {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        bean = context.getBean(ShippingCenter.class);
    }

    @Test
    public void shouldReturnCorrectMessageIfWeightIsCorrect() {
        String message = bean.sendPackage("Wroclaw", 20);
        Assertions.assertEquals("Package delivered to: Wroclaw", message);
    }

    @Test
    public void shouldReturnCorrectMessageIfWeightIsToHeavy() {
        String message = bean.sendPackage("Wroclaw", 310);
        Assertions.assertEquals("Package not delivered to: Wroclaw", message);
    }
   }
