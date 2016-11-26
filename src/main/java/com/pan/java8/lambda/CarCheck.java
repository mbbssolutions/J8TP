package com.pan.java8.lambda;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Pavan_Karasala on 10/15/2016.
 */
public class CarCheck {
    public static void main(String arfs[]){
        final Car car=Car.create(Car::new);
        final List<Car> cars=Arrays.asList(car);
        cars.forEach(Car::collide);
        cars.forEach(Car::repair);

        final Car police=Car.create(Car::new);
        cars.forEach(police::follow);
    }
}
