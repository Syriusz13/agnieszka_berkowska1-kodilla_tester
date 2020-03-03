package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {

        Set<Stamp> stamps = new HashSet<>();

        stamps.add(new Stamp("Myotis myotis", "large", false));
        stamps.add(new Stamp("Myotis Bechsteini", "medium", false));
        stamps.add(new Stamp("Plecotus auritus", "small", false));
        stamps.add(new Stamp("Eptesicus serotinus", "large", true));
        stamps.add(new Stamp("Myotis myotis", "small", false));
        stamps.add(new Stamp("Pipistrellus pipistrellus", "small", true));
        stamps.add(new Stamp("Plecotus auritus", "small", false));

        System.out.println("Stamps collection size: " + stamps.size());

        for (Stamp stamp : stamps) {
            System.out.println(stamp);
        }
    }
}
