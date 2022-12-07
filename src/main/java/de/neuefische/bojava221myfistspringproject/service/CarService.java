package de.neuefische.bojava221myfistspringproject.service;

import de.neuefische.bojava221myfistspringproject.model.Car;
import de.neuefische.bojava221myfistspringproject.repo.CarRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarService {

    private final CarRepo carRepo;

    public Car addCar(Car car){
        return carRepo.addCar(car);
    }

    public List<Car> getCars(){
        return carRepo.getCars();
    }

}
