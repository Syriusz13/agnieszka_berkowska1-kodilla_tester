package com.kodilla.collections.adv.maps.complex;

import java.util.ArrayList;
import java.util.List;

public class Grades {

    private List<Double> grades = new ArrayList<>(); //tworzymy kolekcję ocen

    public Grades(double ... grades) {              // konstruktor umożliwiający dodanie dowolnej liczby ocen
        for (double grade : grades)
            this.grades.add(grade);
    }

    public double getAverage() {                // metoda obliczjąca średnią
        double sum = 0;
        for (double grade: grades)
            sum = sum + grade;
        return sum/grades.size();
        }

    @Override                               //???
    public String toString() {
        return "Grades: " + grades.toString();
    }
}

