package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.graalvm.compiler.core.common.type.ArithmeticOpTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ShippingCenter {

    private NotificationService notificationService;
    private DeliveryService deliveryService;


    public ShippingCenter(NotificationService notificationService, DeliveryService deliveryService) {
        this.notificationService = notificationService;
        this.deliveryService = deliveryService;
    }

    // tutaj dodaj odpowiednie wstrzykiwanie zależności

    public String sendPackage(String address, double weight) {
        if (deliveryService.deliverPackage(address, weight)) {
            return notificationService.success(address);
        }
        return notificationService.fail(address);
    }
}
