package com.directi.training.srp.exercise_solution;

public class CarComparator{
    public compare(List<Car> _carsDb){
    Car bestCar = null;
        for (Car car : _carsDb) {
            if (bestCar == null || car.getModel().compareTo(bestCar.getModel()) > 0) {
                bestCar = car;
            }
        }
        return bestCar;

    }
}