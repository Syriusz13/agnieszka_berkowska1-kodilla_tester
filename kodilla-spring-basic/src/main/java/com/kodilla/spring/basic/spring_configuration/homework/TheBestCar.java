package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TheBestCar {

    SeasonDealer seasonDealer;

    @Autowired
    public TheBestCar(SeasonDealer seasonDealer) {
        this.seasonDealer = seasonDealer;
    }

    @Bean
    public Car bestCar() {
        Car car;
        String season = seasonDealer.currentSeason();
        if (season.equals("Winter")) {
            car = new SUV();
        } else if (season.equals("Summer")) {
            car = new Cabrio();
        } else {
            car = new Sedan();
        }
        return car;
    }
}
