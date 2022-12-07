package de.neuefische.bojava221myfistspringproject.contoller;

import de.neuefische.bojava221myfistspringproject.model.Car;
import de.neuefische.bojava221myfistspringproject.service.CarService;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/car")
@RequiredArgsConstructor
public class CarController {

    private final CarService service;

    @PostMapping
    public Car addCar(@RequestBody Car car){
        return service.addCar(car);
    }

    @GetMapping
    public List<Car> getCars(){
        return service.getCars();
    }


}
