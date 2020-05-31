package com.kodilla.spring.basic.dependency_injection.homework;

public class ShippingCenterImpl implements ShippingCenter {

    private DeliveryService deliveryService;
    private NotificationService notificationService;

    public ShippingCenterImpl(DeliveryService deliveryService, NotificationService notificationService) {
    this.deliveryService = deliveryService;
    this.notificationService = notificationService;
    }

    @Override
    public void sendPackage(String address, double weight) {
        if (deliveryService.deliverPackage(address, weight)) {
            notificationService.success(address);
        }
        notificationService.fail(address);
    }
}


