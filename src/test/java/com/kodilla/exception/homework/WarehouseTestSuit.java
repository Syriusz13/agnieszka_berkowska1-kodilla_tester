package com.kodilla.exception.homework;

import com.kodilla.exception.AirportNotFoundException;
import org.junit.Test;

import static org.junit.Assert.*;

public class WarehouseTestSuit {

    @Test
    public void testIsOrderOnTheList() throws OrderDoesntExistException {
        //given
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("123"));
        //when
        Order is123onTheList = warehouse.getOrder("123");
        //then
        equals(is123onTheList);
    }

    @Test(expected = OrderDoesntExistException.class)
    public void testIsOrderOnTheListWithExeption() throws OrderDoesntExistException {
        //given
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("123"));
        //when
        Order is123onTheList = warehouse.getOrder("234");
        //then
        equals(is123onTheList);
    }
}