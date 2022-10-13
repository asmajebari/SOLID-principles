package com.directi.training.srp.exercise_solution;



public class CarManager
{
    private final CarData _carData;
    private final CarFormatter _carFormatter;
    private final CarComparator _carComparator;

    public Car getFromDb(final String carId)
    {
        return _carData.getById(carId);
    }
    
    public String getCarsNames();
    {
       return _carFormatter.formatToString(_carData.getAll());
    }

    public Car getBestCar()
    {
        _carComparator.compare(_carData.getAll());
        
        }
}
