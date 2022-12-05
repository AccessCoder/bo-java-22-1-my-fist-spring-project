package de.neuefische.bojava221myfistspringproject.service;

import de.neuefische.bojava221myfistspringproject.model.Car;
import de.neuefische.bojava221myfistspringproject.repo.CarRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    private final CarRepo repo;

    public CarService(CarRepo repo) {
        this.repo = repo;
    }

    public Car addCar(Car car){
        return repo.addCar(car);
    }

    public List<Car> getCars(){
        return repo.getCars();
    }

}
