package com.kodilla.execution_model.homework;

public class Order {

    private String date;
    private String personLogin;
    private double orderValue;

    public Order(String date, String personLogin, double orderValue) {
        this.date = date;
        this.personLogin = personLogin;
        this.orderValue = orderValue;
    }

    public String getDate() {
        return date;
    }

    public String getPersonLogin() {
        return personLogin;
    }

    public double getOrderValue() {
        return orderValue;
    }


}
