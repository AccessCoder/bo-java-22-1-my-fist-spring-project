package de.neuefische.bojava221myfistspringproject.contoller;

import de.neuefische.bojava221myfistspringproject.model.Car;
import de.neuefische.bojava221myfistspringproject.service.CarService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/car")
public class CarController {

    private final static CarService service = new CarService();

    @PostMapping
    public Car addCar(@RequestBody Car car){
        return service.addCar(car);
    }

    @GetMapping
    public List<Car> getCars(){
        return service.getCars();
    }


}
