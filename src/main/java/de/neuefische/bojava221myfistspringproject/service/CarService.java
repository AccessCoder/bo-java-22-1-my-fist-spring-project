package de.neuefische.bojava221myfistspringproject.service;

import de.neuefische.bojava221myfistspringproject.model.Car;
import de.neuefische.bojava221myfistspringproject.repo.CarRepo;

import java.util.List;

public class CarService {

    private final static CarRepo repo = new CarRepo();

    public Car addCar(Car car){
        return repo.addCar(car);
    }

    public List<Car> getCars(){
        return repo.getCars();
    }

}
