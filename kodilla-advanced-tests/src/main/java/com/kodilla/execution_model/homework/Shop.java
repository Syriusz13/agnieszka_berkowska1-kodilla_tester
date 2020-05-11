package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Shop {

    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        orders.add(order);
    }

    public List<Order> getOrdersBetweenDates(LocalDate from, LocalDate to) {
        return orders.stream().filter(o -> o.getDate().isAfter(from) || o.getDate().isEqual(from))
                .filter(o -> o.getDate().isBefore(to) || o.getDate().isEqual(to)).collect(Collectors.toList());
    }

    public Set<Order> getOrdersBetweenValues(double min, double max) {
        return orders.stream().filter(o -> o.getOrderValue() >= min)
                .filter(o -> o.getOrderValue() <= max).collect(Collectors.toSet());
    }

    public int getAmountOrders() {

        return orders.size();
    }

    public double calculateSumOfOrders() {

        return orders.stream().map(o -> o.getOrderValue()).reduce(0.0, Double::sum);
        /*double sum = 0;
        for (Order order : orders) {
            sum = sum + order.getOrderValue();
        }
        return sum;*/
    }
}
