package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShopTestSuite {

    Shop shop;
    Order order1 = new Order (LocalDate.of(2020, 5, 10), "Little Bee", 234.22);
    Order order2 = new Order (LocalDate.of(2020,3,2), "Little Bee", 100);
    Order order3 = new Order (LocalDate.of(2020,2,3), "Little Bee", 200);
    Order order4 = new Order (LocalDate.of(2013,2,2), "Little Bee", 300);

    @BeforeEach
    public void clearShop() {
        shop = new Shop();
    }


    @Test
    public void shouldAddOrderToShop () {
        //Given
        shop.addOrder(order1);
        //When
        int numberOfOrders = shop.getAmountOrders();
        //Then
        assertEquals(1, numberOfOrders);
    }

    @Test
    public void shouldHeveSizeZeroIfNoOrders () {
        //Given empty Shop
        //When
        int numberOfOrders = shop.getAmountOrders();
        //Then
        assertEquals(0, numberOfOrders);
    }

    @Test
    public void howManyOrdersIs () {
        //Given
        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
        shop.addOrder(order4);
        //When
        int amountOfOrders = shop.getAmountOrders();
        //Then
        assertEquals(4, amountOfOrders);
    }

    @Test
    public void shouldCalculateSumOfOrders () {
        //Given
        shop.addOrder(order2);
        shop.addOrder(order3);
        shop.addOrder(order4);
        //When
        double sumOfOrders = shop.calculateSumOfOrders();
        //Then
        assertEquals(600, sumOfOrders);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/shopMinMax.csv", numLinesToSkip = 1)
    public void shouldGetOrdersBetweenValues (double min, double max, int expected) {
        //Given
        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
        shop.addOrder(order4);
        //When
        Set <Order> ordersBetweenValues = shop.getOrdersBetweenValues(min, max);
        //Then
        assertEquals(expected, ordersBetweenValues.size());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/shopDates.csv", numLinesToSkip = 1)
    public void shouldGetOrdersBetweenDates (LocalDate from, LocalDate to, int expected) {
        //Given
        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
        shop.addOrder(order4);
        //When
        List <Order> ordersBetweenDates = shop.getOrdersBetweenDates(from, to);
        //Then
        assertEquals(expected, ordersBetweenDates.size());
    }
}
