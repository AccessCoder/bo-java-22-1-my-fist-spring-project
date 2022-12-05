package de.neuefische.bojava221myfistspringproject.contoller;

import de.neuefische.bojava221myfistspringproject.service.CarService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/car")
public class CarController {

    private final static CarService service = new CarService();


}
