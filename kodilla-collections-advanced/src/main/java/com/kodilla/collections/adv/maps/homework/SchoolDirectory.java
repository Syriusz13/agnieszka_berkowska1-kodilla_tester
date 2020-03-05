package com.kodilla.collections.adv.maps.homework;

import com.kodilla.collections.adv.maps.complex.Grades;
import com.kodilla.collections.adv.maps.complex.Student;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {

    public static void main(String[] args) {

        Map<Principal, School> schoolDirector = new HashMap<>();

        Principal elvis = new Principal("Elvis Presley");
        Principal shrek = new Principal("Shrek McOgr");
        Principal batman = new Principal("Bruce Wahne");

        School no1 = new School("LO nr 1", 15, 20, 10, 10);
        School no18 = new School("ZS nr 18", 33, 30, 27, 24, 12);
        School no5 = new School("SP nr 5", 4, 5, 6);

        schoolDirector.put(elvis, no1);
        schoolDirector.put(shrek, no18);
        schoolDirector.put(batman, no5);

        for (Map.Entry<Principal, School> principalentry : schoolDirector.entrySet()) {
            System.out.println("Principal: " + principalentry.getKey().getPrincipalName() + " School: "
                    + principalentry.getValue().getSchoolName() + " Student: " + principalentry.getValue().getSum());

        }
    }
}
