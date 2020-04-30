package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalTime;

@SpringBootTest
public class TheBestCarTestSuite {

    @Mock
    private SeasonDealer seasonDealer;

    @InjectMocks
    private TheBestCar carConfiguration;

    /*@BeforeAll
    public static void beforeAll () {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration.homework");
        bean = context.getBean("bestCar",Car.class);
    }*/

    @Test
    public void shouldReturnCarForWinter() {
        //Given
        Mockito.when(seasonDealer.currentSeason()).thenReturn("Winter");
        LocalTime time = LocalTime.of(23,59);
        //When
        Car car = carConfiguration.bestCar();
        //Then
       Assertions.assertEquals("SUV", car.getCarType());
       Assertions.assertEquals(true, car.hasHeadlightsTurnedOn(time));
    }

    @Test
    public void shouldReturnCarForSummer() {
        //Given
        Mockito.when(seasonDealer.currentSeason()).thenReturn("Summer");
        LocalTime time = LocalTime.of(7,59);
        //When
        Car car = carConfiguration.bestCar();
        //Then
        Assertions.assertEquals("Cabrio", car.getCarType());
        Assertions.assertEquals(false, car.hasHeadlightsTurnedOn(time));
    }

    @Test
    public void shouldReturnCarForSpring() {
        //Given
        Mockito.when(seasonDealer.currentSeason()).thenReturn("Spring");
        LocalTime time = LocalTime.of(00,59);
        //When
        Car car = carConfiguration.bestCar();
        //Then
        Assertions.assertEquals("Sedan", car.getCarType());
        Assertions.assertEquals(true, car.hasHeadlightsTurnedOn(time));
    }

    @Test
    public void shouldReturnCarForFall() {
        //Given
        Mockito.when(seasonDealer.currentSeason()).thenReturn("Fall");
        LocalTime time = LocalTime.of(12,00);
        //When
        Car car = carConfiguration.bestCar();
        //Then
        Assertions.assertEquals("Sedan", car.getCarType());
        Assertions.assertEquals(false, car.hasHeadlightsTurnedOn(time));
    }

    @Test
    public void shouldReturnCarForPlagueTime() {
        //Given
        Mockito.when(seasonDealer.currentSeason()).thenReturn("PlagueTime");
        LocalTime time = LocalTime.of(00,00);
        //When
        Car car = carConfiguration.bestCar();
        //Then
        Assertions.assertEquals("Sedan", car.getCarType());
        Assertions.assertEquals(true, car.hasHeadlightsTurnedOn(time));
    }
}
