package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private List<Car> cars = new ArrayList<>();

    public CarServiceImpl() {
        cars.add(new Car("LADA KALINA", 175, "Red"));
        cars.add(new Car("Cherry Arrizo 8", 205, "Orange"));
        cars.add(new Car("Toyota RAV4", 225, "Blue"));
        cars.add(new Car("BMW X7", 275, "Green"));
        cars.add(new Car("Renault Logan", 165, "Red"));
    }


    @Override
    public List<Car> getCars(int count) {
        return cars.stream().limit(count).toList();
    }
}
