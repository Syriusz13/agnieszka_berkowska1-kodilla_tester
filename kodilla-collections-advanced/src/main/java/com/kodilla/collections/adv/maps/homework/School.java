package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {

    private String schoolName;

    private List<Integer> numberOfStudentsAtClasses = new ArrayList<>();

    public School(String schoolName, int ... numberOfStudentsAtClasses) {              // konstruktor umożliwiający dodanie dowolnej liczby ocen
        for (int numberOfStudent : numberOfStudentsAtClasses)
            this.numberOfStudentsAtClasses.add(numberOfStudent);
            this.schoolName = schoolName;
    }

    public int getSum() {                // metoda obliczjąca sumę
        int sum = 0;
        for (int numberOfStudents: numberOfStudentsAtClasses)
            sum = sum + numberOfStudents;
        return sum;
    }

    public String getSchoolName() {
        return schoolName;
    }
}
