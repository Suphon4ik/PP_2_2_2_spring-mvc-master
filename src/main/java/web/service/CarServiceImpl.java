package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private final List<Car> cars;

    public CarServiceImpl() {
        cars = new ArrayList<Car>();
        cars.add(new Car("BMW", 2018, "Red"));
        cars.add(new Car("Audi", 2019, "Blue"));
        cars.add(new Car("Honda", 2020, "Green"));
        cars.add(new Car("Lada", 2013, "Yellow"));
        cars.add(new Car("Porsche", 2014, "Red"));
    }

    @Override
    public List<Car> getCar(int count) {
        if (count >= 5) {
            return cars;
        }
        return cars.subList(0, Math.min(count, cars.size()));
    }
}
