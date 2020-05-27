package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public abstract class AbstractCar implements Car {
    @Override
    public abstract String getCarType();

    @Override
    public boolean hasHeadlightsTurnedOn(LocalTime time) {
      int hour = time.getHour();
        if (hour < 6 || 20 <= hour){
            return true;}
        return false;
    }
}
