package holidayWork.miniProject.secondProject.ui;

import holidayWork.miniProject.secondProject.dto.ResponceCarDTO;
import holidayWork.miniProject.secondProject.entity.Car;
import holidayWork.miniProject.secondProject.repository.CarRepository;
import holidayWork.miniProject.secondProject.service.CarService;

import java.util.Scanner;

public class UI {
    private final Scanner scanner = new Scanner(System.in);
    private final CarService carService = new CarService();


    public void printMenu (){
        while(true){
            System.out.println("====*Menu*====");
            System.out.println("1. Add Car");
            System.out.println("2.Find Car");
            System.out.println("3.Sorting");
            System.out.println("4.Delete Car");
            System.out.println("5.Update Menu");
            System.out.println("0.Exit");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1" -> createCar();
                case "2" -> menuForSearch();
                case "3" -> menuForSorting();
                case "4" ->  deleteCar();
                case "5" -> menuForUpdate();
                case "0" -> {
                    System.out.println("Exit");
                    return;
                }
                default -> System.out.println("Invalid choice");

            }
        }

    }

    private void menuForSearch(){
        while(true){
            System.out.println("*===Search*===");
            System.out.println("1.Find Car by Model");
            System.out.println("2.Find by Brand");
            System.out.println("3.Find by Price");
            System.out.println("4.Find by Rating");
            System.out.println("5.Find by VIN Number");
            System.out.println("6.Find by Year");
            System.out.println("7.Find all Car");
            System.out.println("8. Go to Main Menu");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1" -> searchByModel();
                case "2" -> searchByBrand();
                case "3" -> findByPriceRange();
                case "4" -> findByRatingRange();
                case "5" -> searchByVINNumber();
                case "6" -> searchByYear();
                case "7" -> printInfoResponse(carService.listAllCar());
                case "8" -> printMenu();
                default -> System.out.println("Invalid choice");
            }
        }

    }

    private void menuForSorting(){
        while(true){
            System.out.println("*==Sorting*===");
            System.out.println("1.Sort by Price");
            System.out.println("2.Sort by Rating");
            System.out.println("3.Go to Main Menu");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1" -> printInfoResponse(carService.sortByPrice());
                case "2" -> printInfoResponse(carService.sortByRating());
                case "3" -> printMenu();
                default -> System.out.println("Invalid choice");
            }
        }
    }

    private void menuForUpdate(){
        while(true){
            System.out.println("*==Update*===");
            System.out.println("1.Update Brand");
            System.out.println("2.Update Price");
            System.out.println("3.Update Rating");
            System.out.println("4.Update Model");
            System.out.println("5.Update Year");
            System.out.println("6.Back to Main Menu");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1" -> updateCarBrand();
                case "2" -> updateCarPrice();
                case "3" -> updateCarRating();
                case "4" -> updateCarModel();
                case "5" -> updateCarYear();
                case "6" -> printMenu();
                default -> System.out.println("Invalid choice");
            }
        }
    }


    private void createCar(){
        System.out.println("Enter Brand");
        String brand = scanner.nextLine();
        System.out.println("Enter Model");
        String model = scanner.nextLine();
        int year = readInt("Enter Year");
        double price = readDouble("Enter Price");
        double rating = readDouble("Enter Rating (from 1 to 10)");
        System.out.println("Enter VIN Number");
        String vin = scanner.nextLine();
        Car car = new Car(brand,vin,rating,price,year,model);
        ResponceCarDTO responce = carService.addCar(car);
        System.out.println(responce.getMessage());
    }

    private void deleteCar(){
        System.out.println("Enter VIN Number for remove");
        ResponceCarDTO responce = carService.removeCar(scanner.next());
        scanner.nextLine();
        System.out.println(responce.getMessage());
    }

    private void updateCarRating(){
        System.out.println("Enter VIN Number ");
        String vin = scanner.nextLine();
        double newRating = readDouble("Enter New Rating");
        ResponceCarDTO responce = carService.updateRating(vin,newRating);
        System.out.println(responce.getMessage());
    }

    private void updateCarPrice(){
        System.out.println("Enter VIN Number ");
        String vin = scanner.nextLine();
        double newPrice = readDouble("Enter New Price");
        ResponceCarDTO responce = carService.updatePrice(vin,newPrice);
        System.out.println(responce.getMessage());
    }

    private void updateCarBrand(){
        System.out.println("Enter VIN Number ");
        String vin = scanner.nextLine();
        System.out.println("Enter Brand for update");
        String brand = scanner.nextLine();
        ResponceCarDTO responce = carService.updateBrand(vin,brand);
        System.out.println(responce.getMessage());
    }

    private void updateCarModel(){
        System.out.println("Enter VIN Number ");
        String vin = scanner.nextLine();
        System.out.println("Enter Model for update");
        String model = scanner.nextLine();
        ResponceCarDTO responce = carService.updateModel(vin,model);
        System.out.println(responce.getMessage());
    }

    private void updateCarYear(){
        System.out.println("Enter Vin Number ");
        String vin = scanner.nextLine();

        int year = readInt("Enter Year for Update");
        ResponceCarDTO responce = carService.updateYear(vin,year);
        System.out.println(responce.getMessage());
    }

    private void searchByBrand(){
        System.out.println("Enter Brand");
        String brand = scanner.nextLine();
        printInfoResponse(carService.findByBrand(brand));
    }

    private void searchByModel(){
        System.out.println("Enter Model");
        String model = scanner.nextLine();
        printInfoResponse(carService.findByModel(model));
    }

    private void searchByYear(){

        int year = readInt("Enter Year");
        printInfoResponse(carService.findByYear(year));
    }

    private void searchByVINNumber(){
        System.out.println("Enter VIN Number");
        String vin = scanner.nextLine();
        printInfoResponse(carService.findByVinNumber(vin));
    }

    private void printInfoResponse(ResponceCarDTO responce){
        System.out.println(responce.getMessage());
        if (responce.getData() != null){
            System.out.println("Info");
            System.out.println(responce.getData());
        }
    }

    private int readInt(String prompt){
        while (true){
            System.out.println(prompt);
            String input = scanner.nextLine();
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e){
                System.out.println("Invalid input . Enter only integer");
            }
        }
    }

    private double readDouble(String prompt){
        while (true){
            System.out.println(prompt);
            String input = scanner.nextLine();
            try {
                return Double.parseDouble(input);
            } catch (NumberFormatException e){
                System.out.println("Invalid input . Enter only double");
            }
        }
    }

    private void findByPriceRange(){
        double min = readDouble("Enter Minimum Price");
        double max = readDouble("Enter Maximum Price");
        printInfoResponse(carService.findCarsByPriceRange(min,max));
    }

    private void findByRatingRange(){
        double min = readDouble("Enter Minimum Rating");
        double max = readDouble("Enter Maximum Rating");
        printInfoResponse(carService.findCarsByRatingRange(min,max));
    }


}
