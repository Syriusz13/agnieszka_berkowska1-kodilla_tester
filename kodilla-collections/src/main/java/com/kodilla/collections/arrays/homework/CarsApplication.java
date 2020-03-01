package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Renault;

import java.util.Random;

public class CarsApplication {

    public static void main(String[] args) {
        Random random = new Random();
        Car[] cars = new Car [random.nextInt(15)+1];

         for (int i = 0; i < cars.length; i++)
            cars[i] = drawnCar();
         for (Car car : cars)
             CarUtils.describeCar(car);
    }

    public static Car drawnCar() {

        Random random = new Random();
        int drawnCarKind = random.nextInt(3);         //wylosowanie liczby w zakresie od 0 do 2 (3-1)
        int speed = random.nextInt(200);                           //nextInt wylosowaliśmy 2 liczby
        int increaseSpeed = random.nextInt(200);
        int decreaseSpeed = random.nextInt(200);

        if (drawnCarKind == 0)                                //jeżeli wyszło 0 to zwróć koło z wymiarami a
            return new Ford(speed,increaseSpeed,decreaseSpeed);
        else if (drawnCarKind == 1)
            return new Opel(speed,increaseSpeed,decreaseSpeed);
        else
            return new Renault(speed,increaseSpeed,decreaseSpeed);
    }
}