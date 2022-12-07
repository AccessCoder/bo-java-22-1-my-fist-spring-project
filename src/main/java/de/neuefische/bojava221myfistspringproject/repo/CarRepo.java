package de.neuefische.bojava221myfistspringproject.repo;

import de.neuefische.bojava221myfistspringproject.model.Car;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarRepo {

    private final List<Car> carList = new ArrayList<>(List.of(
            new Car("Audi", 4, true),
            new Car("BMW", 4, false),
            new Car("VW", 4, true)
    ));

    public Car addCar(Car car){
        carList.add(car);
        return car;
    }

    public List<Car> getCars(){
        return carList;
    }

}
