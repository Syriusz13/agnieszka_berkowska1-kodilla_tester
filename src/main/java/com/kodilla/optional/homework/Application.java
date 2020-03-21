package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {

    public static void main(String[] args) {

        Teacher undefined = new Teacher("<undefined>");
        List<Student> allocations = new ArrayList<>();
            allocations.add(new Student("Kleofas", null));
            allocations.add(new Student("Pankracy",new Teacher("Bonifacy")));

        allocations
                .stream()
                .forEach(student -> System.out.println("Uczeń: " + student.getName() + " Nauczyciel:"
                        + Optional.ofNullable(student.getTeacher()).orElse(undefined).getName()));
    }
}
