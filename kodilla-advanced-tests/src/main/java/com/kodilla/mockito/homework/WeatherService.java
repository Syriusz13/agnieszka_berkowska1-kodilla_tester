package com.kodilla.mockito.homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class WeatherService {
    private HashMap<Person, Set<Location>> subscribersInLocation = new HashMap<>();


    public void addSubscriber(Person person, Location location) {
        subscribersInLocation.computeIfAbsent(person, k -> new HashSet<>()).add(location);
    }

    public void sendNotificationToAll(WeatherThreatNotification weatherThreatNotification) {
        subscribersInLocation.entrySet()
                .stream()
                .forEach(entry -> entry.getKey().receive(weatherThreatNotification));
    }

    public void sentNotificationToLocation(WeatherThreatNotification weatherThreatNotification, Location location) {
        subscribersInLocation.entrySet()
                .stream()
                .filter(entry -> entry.getValue().contains(location))
                .forEach(entry -> entry.getKey().receive(weatherThreatNotification));
    }

    public void removeSubscriptionFromLocation(Person person, Location location) {
        this.subscribersInLocation.entrySet()
                .stream()
                .filter(entry -> entry.getKey().equals(person))
                .forEach(entry -> entry.getValue().remove(location));
    }

    public void removeAllSubscriptions(Person person) {
        this.subscribersInLocation.entrySet()
                .removeIf(entry -> (person.equals(entry.getKey())));
    }

    public void removeLocation(Location location) {
        this.subscribersInLocation.entrySet()
                .stream()
                .filter(entry -> entry.getValue().contains(location))
                .forEach(entry -> entry.getValue().remove(location));
    }
}
