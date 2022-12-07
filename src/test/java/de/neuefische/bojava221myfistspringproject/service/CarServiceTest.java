package de.neuefische.bojava221myfistspringproject.service;

import de.neuefische.bojava221myfistspringproject.model.Car;
import de.neuefische.bojava221myfistspringproject.repo.CarRepo;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class CarServiceTest {

    CarRepo repo = mock(CarRepo.class);

    CarService service = new CarService(repo);

    @Test
    void addCar() {
        //GIVEN
        Car car = new Car("Audi",4, true );
        when(repo.addCar(car)).thenReturn(car);
        //WHEN
        Car actual = service.addCar(car);
        //THEN
        assertEquals(new Car("Audi",4, true ), actual);

    }

    @Test
    void getCars(){
        //GIVEN
        Car car1 = new Car("Audi",4, true );
        Car car2 = new Car("VW",4, true );
        List<Car> carList = new ArrayList<>(List.of(car1, car2));
        when(repo.getCars()).thenReturn(carList);
        //WHEN
        List<Car> actual = service.getCars();
        //THEN
        assertEquals(List.of(car1, car2), actual);
        verify(repo).getCars();
    }
}