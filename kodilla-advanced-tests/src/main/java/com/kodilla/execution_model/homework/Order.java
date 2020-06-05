package com.kodilla.execution_model.homework;

import java.time.LocalDate;

public class Order {

    private LocalDate date;
    private String personLogin;
    private double orderValue;

    public Order(LocalDate date, String personLogin, double orderValue) {
        this.date = date;
        this.personLogin = personLogin;
        this.orderValue = orderValue;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getPersonLogin() {
        return personLogin;
    }

    public double getOrderValue() {
        return orderValue;
    }
}
