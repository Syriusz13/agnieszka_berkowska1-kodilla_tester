package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {
    Display display;

    @Autowired
    public Calculator(Display display) {
        this.display = display;
    }

    public double add (double a, double b){
        double sum = a + b;
        display.display(sum);
        return sum;
    }

    public double subtract (double a, double b){
        double difference = a-b;
        display.display(difference);
        return difference;
    }

    public double multiplay (double a, double b){
        double product = a * b;
        display.display(product);
        return product;
    }

    public double divide (double a, double b){
        double quotient = a / b;
        display.display(quotient);
        return quotient;
    }
}
