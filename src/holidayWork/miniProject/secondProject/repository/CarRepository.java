package holidayWork.miniProject.secondProject.repository;

import holidayWork.miniProject.secondProject.entity.Car;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CarRepository {
    private Map<String, Car> cars = new HashMap<>();

    public void addCar(Car car) {
        cars.put(car.getVin(), car);
    }

    public void deleteCar(String vin) {
        cars.remove(vin);
    }

    public Car findbyVin(String vin) {
        return cars.get(vin);
    }

    public Collection<Car> findAll() {
        return cars.values();
    }

    public boolean existsByVin(String vin){
        return cars.containsKey(vin);
    }


}
