package com.kodilla.mockito.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.HashSet;
import java.util.Set;

public class WeatherServiceTestSuite {
    WeatherService weatherService = new WeatherService();
    Person person = Mockito.mock(Person.class);
    Person person1 = Mockito.mock(Person.class);
    Person person2 = Mockito.mock(Person.class);
    Person person3 = Mockito.mock(Person.class);
    WeatherThreatNotification weatherThreatNotification = Mockito.mock(WeatherThreatNotification.class);
    Location location = Mockito.mock(Location.class);
    Location location1 = Mockito.mock(Location.class);
    Set<Person> persons = new HashSet<>();
    Set<Location> locations = new HashSet<>();

    @BeforeEach
    public void prepareData() {
        persons.add(person);
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);

        locations.add(location);
        locations.add(location1);

        for (Location location : locations) {
            weatherService.addSubscriber(person,location);
        }
    }

    @Test
    public void subscriberShouldReceiveNotificationFromLocationToWitchHeIsSubscribed() {
        for(Location location: locations) {
            weatherService.sentNotificationToLocation(weatherThreatNotification, location);
        }

        Mockito.verify(person, Mockito.times(2)).receive(weatherThreatNotification);
    }

    @Test
    public void subscriberShouldBeAbleToRemoveSubscriptionToLocation() {
        weatherService.removeSubscriptionFromLocation(person, location1);

        for(Location location: locations) {
            weatherService.sentNotificationToLocation(weatherThreatNotification, location);
        }

        Mockito.verify(person, Mockito.times(1)).receive(weatherThreatNotification);
    }

    @Test
    public void shouldRemoveAllSubscriptions() {
        weatherService.removeAllSubscriptions(person);

        for(Location location: locations) {
            weatherService.sentNotificationToLocation(weatherThreatNotification, location);
        }

        Mockito.verify(person, Mockito.never()).receive(weatherThreatNotification);
    }

    @Test
    public void shouldSentNotificationOnlyToSubscribesSubscribedToLocation() {
        weatherService.removeSubscriptionFromLocation(person, location1);
        weatherService.addSubscriber(person1, location);
        weatherService.addSubscriber(person2, location);
        weatherService.addSubscriber(person3, location1);

        for(Location location: locations) {
            weatherService.sentNotificationToLocation(weatherThreatNotification, location);
        }

        for(Person person : this.persons){
            Mockito.verify(person, Mockito.times(1)).receive(weatherThreatNotification);
        }
    }

    @Test
    public void shouldSentNotificationToAllSubscribers() {
        weatherService.addSubscriber(person, location);
        weatherService.addSubscriber(person1, location1);
        weatherService.addSubscriber(person2, location1);
        weatherService.addSubscriber(person3, location);

        weatherService.sendNotificationToAll(weatherThreatNotification);

        for(Person person : this.persons){
            Mockito.verify(person, Mockito.times(1)).receive(weatherThreatNotification);
        }
    }

    @Test
    public void shouldRemoveLocationForAllSubscribers() {
        for (Person person : persons) {
            weatherService.addSubscriber(person,location);
        }

        weatherService.removeLocation(location);

        for(Person person : this.persons){
            Mockito.verify(person, Mockito.never()).receive(weatherThreatNotification);
        }
    }
}
