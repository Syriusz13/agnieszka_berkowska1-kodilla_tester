package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("123"));
        warehouse.addOrder(new Order("456"));

        try {
            warehouse.getOrder("123");
        } catch (OrderDoesntExistException e) {
            System.out.println("There is no order no: 123");
        }
        try {
            warehouse.getOrder("789");
        } catch (OrderDoesntExistException e) {
            System.out.println("There is no order no: 789");
        }
        try {
            warehouse.getOrder("456");
        } catch (OrderDoesntExistException e) {
            System.out.println("There is no order no: 456");
        }
    }
}
