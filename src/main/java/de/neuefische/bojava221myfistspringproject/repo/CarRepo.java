package de.neuefische.bojava221myfistspringproject.repo;

import de.neuefische.bojava221myfistspringproject.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarRepo {

    List<Car> carList = new ArrayList<Car>();

    public Car addCar(Car car){
        carList.add(car);
        return car;
    }

    public List<Car> getCars(){
        return carList;
    }

}
