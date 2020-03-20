package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {

    @Test
    public void testFindFlightsFrom() {
        //given
        List<Flight> testFlightsFromWroclaw = new ArrayList<>();
        testFlightsFromWroclaw.add(new Flight("Wrocław", "Warszawa"));
        testFlightsFromWroclaw.add(new Flight("Wrocław", "Kraków"));
        testFlightsFromWroclaw.add(new Flight("Wrocław", "Londyn"));
        //when
        FlightFinder flightFinder = new FlightFinder();                     //???
        List<Flight> flightsFromWroclaw = flightFinder.findFlightsFrom("Wrocław");
        //then
        assertEquals(testFlightsFromWroclaw, flightsFromWroclaw);
    }
    @Test
    public void testFindFlightsTo() {
        //given
        List<Flight> testFlightsToKrakow = new ArrayList<>();
        testFlightsToKrakow.add(new Flight("Wrocław", "Kraków"));
        //when
        FlightFinder flightFinder = new FlightFinder();                         //???
        List<Flight> flightsToKrakow = flightFinder.findFlightsTo("Kraków");
        //then
        assertEquals(testFlightsToKrakow, flightsToKrakow);
    }
}