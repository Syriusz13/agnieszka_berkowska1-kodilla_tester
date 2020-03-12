package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

    public static List<Flight> getFlightsTable() {
        List<Flight> flightList = new ArrayList<>();

        flightList.add(new Flight("Wrocław", "Warszawa")); //dlaczego jak próbowałam wywołać to osobno - poza metodą getFlightTable (najpierw utworzyłam listę a potem chciałam do niej coś dodać - to nie działałało
        flightList.add(new Flight("Wrocław", "Kraków"));
        flightList.add(new Flight("Warszawa", "Wrocław"));
        flightList.add(new Flight("Wrocław", "Londyn"));
        flightList.add(new Flight("Londyn", "Wrocław"));
        flightList.add(new Flight("Kraków", "Wrocław"));

        return flightList;
    }
}
