package holidayWork.miniProject.secondProject.service;

import holidayWork.miniProject.secondProject.dto.ResponceCarDTO;
import holidayWork.miniProject.secondProject.entity.Car;
import holidayWork.miniProject.secondProject.repository.CarRepository;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CarService {

    private CarRepository carRepository = new CarRepository();

    public CarService() {
        this.carRepository = carRepository;
    }

    public ResponceCarDTO addCar(Car car){
        if(carRepository.existsByVin(car.getVin())){
            return new ResponceCarDTO(false,"Vin already exists");
        }
        if (car.getRating() < 0 || car.getRating() > 10) {
            return new ResponceCarDTO(false,"Rating must be between 0 and 10");
        }
        carRepository.addCar(car);
        return new ResponceCarDTO(true,"Car added");
    }

    public ResponceCarDTO removeCar(String vin){
        if(!carRepository.existsByVin(vin)){
            return new ResponceCarDTO(false,"Car with Vin number not found");
        }
        carRepository.deleteCar(vin);
        return new ResponceCarDTO(true,"Car removed");
    }

    public ResponceCarDTO updateRating(String vin, double newRating){
        Car carForNewRating = carRepository.findbyVin(vin);
        if(carForNewRating == null){
            return new ResponceCarDTO(false,"Car with Vin number not found");
        }
        carForNewRating.setRating(newRating);
        return new ResponceCarDTO(true,"Rating updated");
    }

    public ResponceCarDTO updatePrice(String vin, double newPrice){
        Car carForNewPrice = carRepository.findbyVin(vin);
        if(carForNewPrice == null){
            return new ResponceCarDTO(false,"Car with Vin number not found");
        }
        carForNewPrice.setPrice(newPrice);
        return new ResponceCarDTO(true,"Price updated");
    }

    public ResponceCarDTO findByBrand(String brand){
        List<Car> list = carRepository.findAll().stream().filter(c -> c.getBrand().equalsIgnoreCase(brand)).collect(Collectors.toList());
        if(list.isEmpty()){
            return new ResponceCarDTO(false,"Cars not found");
        }
        return new ResponceCarDTO(true,"Cars found : " + list.size() + list);
    }

    public ResponceCarDTO findByVinNumber(String vin){
        List<Car> list = carRepository.findAll().stream().filter(c -> c.getVin().equalsIgnoreCase(vin)).collect(Collectors.toList());
        if(list.isEmpty()){
            return new ResponceCarDTO(false,"Cars not found");
        }
        return new ResponceCarDTO(true,"Cars found : "  + list.size() + list);
    }

    public ResponceCarDTO findByModel(String model){
        List<Car> list = carRepository.findAll().stream().filter(c -> c.getModel().equalsIgnoreCase(model)).collect(Collectors.toList());
        if(list.isEmpty()){
            return new ResponceCarDTO(false,"Cars not found");
        }
        return new ResponceCarDTO(true,"Cars found : "  + list.size() + list);
    }

    public ResponceCarDTO findByYear(int year){
        List<Car> list = carRepository.findAll().stream().filter(c -> c.getYear() == year).collect(Collectors.toList());
        if(list.isEmpty()){
            return new ResponceCarDTO(false,"Cars not found ");
        }
        return new ResponceCarDTO(true,"Cars found : "  + list.size() + list);
    }

    public ResponceCarDTO findByPrice(double price){
        List<Car> list = carRepository.findAll().stream().filter(c -> c.getPrice() == price).collect(Collectors.toList());
        if(list.isEmpty()){
            return new ResponceCarDTO(false,"Cars not found");
        }
        return new ResponceCarDTO(true,"Cars found : "  + list.size() + list);
    }

    public ResponceCarDTO findByRating(double rating){
        List<Car> list = carRepository.findAll().stream().filter(c -> c.getRating() == rating).collect(Collectors.toList());
        if(list.isEmpty()){
            return new ResponceCarDTO(false,"Cars not found");
        }
        return new ResponceCarDTO(true,"Cars found : "  + list.size() + list);
    }

    public ResponceCarDTO sortByPrice() {
        List<Car> list = carRepository.findAll().stream().sorted(Comparator.comparing(Car::getPrice)).collect(Collectors.toList());

        return  new ResponceCarDTO(true,"Sort by Price : "  + list);
    }

    public ResponceCarDTO sortByRating() {
        List<Car> list = carRepository.findAll().stream().sorted(Comparator.comparing(Car::getRating)).collect(Collectors.toList());
        return new ResponceCarDTO(true,"Sort by Rating : "  + list);
    }

    public ResponceCarDTO listAllCar() {
        List<Car> list = new ArrayList<>(carRepository.findAll());
        return new ResponceCarDTO(true,"All cars : " + list);
    }


    public ResponceCarDTO findCarsByPriceRange(double minPrice, double maxPrice){
        List<Car> list = carRepository.findAll().stream().filter(c -> c.getPrice() >= minPrice && c.getPrice() <= maxPrice).collect(Collectors.toList());
        if(list.isEmpty()){
            return new ResponceCarDTO(false,"Cars not found");
        }
        return new ResponceCarDTO(true,"Cars found : " + list.size() + list);
    }

    public ResponceCarDTO findCarsByRatingRange(double minRating, double maxRating){
        List<Car> list = carRepository.findAll().stream().filter(c -> c.getRating() >= minRating && c.getRating() <= maxRating).collect(Collectors.toList());
        if (list.isEmpty()){
            return new ResponceCarDTO(false,"Cars not found");
        }
        return new ResponceCarDTO(true,"Cars found : " + list.size() + list);
    }

}
