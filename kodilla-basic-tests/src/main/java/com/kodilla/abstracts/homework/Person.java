package com.kodilla.abstracts.homework;

public class Person {

    private String firstName;
    private int age;
    private Job job;                        // tworzę zmieną job na bazie klasy Job

    public Person(String firstName, int age, Job job) {         //konstruktor

        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    public void showPersonResponsibilities() {

        System.out.println(firstName + " responsibilities: " + job.getResponsibilities()); //zaciągam getter z job
    }

    public static void main(String[] args) {

        Person aga = new Person("aga", 40, new Teacher());   // new Teacher() - Tworzę konkretny obiekt

        aga.showPersonResponsibilities();                                   // wywołuje na aga metodę
    }

}


