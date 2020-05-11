package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class SeasonDealer {
    public String currentSeason (){
        String seasons[] = {
                "Winter", "Winter", "Spring", "Spring", "Summer", "Summer",
                "Summer", "Summer", "Fall", "Fall", "Winter", "Winter"
        };
        return seasons[ LocalDate.now().getMonthValue() -1];
    }
}
