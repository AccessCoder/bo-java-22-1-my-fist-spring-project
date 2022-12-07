package de.neuefische.bojava221myfistspringproject.repo;

import de.neuefische.bojava221myfistspringproject.model.Car;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarRepo {

    List<Car> carList = new ArrayList<Car>();

    public Car addCar(Car car){
        carList.add(car);
        return new Car("BmW", 2, false);
    }

    public List<Car> getCars(){
        return new ArrayList<Car>();
    }

}
