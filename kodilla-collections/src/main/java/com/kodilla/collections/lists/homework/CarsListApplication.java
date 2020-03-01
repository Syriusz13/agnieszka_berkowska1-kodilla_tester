package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Renault;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {

    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();

        Car ford = new Ford(200,50,80);

        cars.add(ford);
        cars.add(new Opel(180, 80, 60));
        cars.add(new Renault(210, 20, 20));

       for (Car car:cars) {
            CarUtils.describeCar(car);
        }

        cars.remove(2);
        cars.remove(ford);

        System.out.println("");
        System.out.println("Rozmiar kolekcji: " + cars.size());

        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
