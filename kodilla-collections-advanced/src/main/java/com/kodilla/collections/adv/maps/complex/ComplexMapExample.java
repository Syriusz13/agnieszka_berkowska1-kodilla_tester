package com.kodilla.collections.adv.maps.complex;

import java.util.HashMap;
import java.util.Map;

public class ComplexMapExample {

    public static void main(String[] args) {

        Map<Student, Grades> school = new HashMap<>();
        Student john = new Student("John", "Stevenson");
        Student jessie = new Student("Jessie", "Pinkman");
        Student bart = new Student("Bart", "Simpson");

        Grades johnGrades = new Grades (5,4,4.5,5,5);
        Grades jessieGrades = new Grades (2.5,3,2);
        Grades bartGrades = new Grades (4,4,4,4,5);

        school.put(john, johnGrades);
        school.put(jessie, jessieGrades);
        school.put(bart, bartGrades);

        System.out.println(school.get(john));

        for (Map.Entry<Student, Grades> studententry : school.entrySet()) {
            System.out.println(studententry.getKey().getFirstName() + ", average: "
                    + studententry.getValue().getAverage());

        }
    }
}