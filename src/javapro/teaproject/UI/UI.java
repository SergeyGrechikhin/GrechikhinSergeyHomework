package javapro.teaproject.UI;

import javapro.teaproject.entity.Manufacturer;
import javapro.teaproject.entity.Tea;
import javapro.teaproject.entity.TypeOfTea;
import javapro.teaproject.service.ManufacturerService;
import javapro.teaproject.service.TeaService;
import javapro.teaproject.service.TypeOfTeaService;

import java.util.Scanner;

public class UI {
    private  TeaService teaService;
    private  ManufacturerService manufacturerService;
    private TypeOfTeaService typeOfTeaService;
    Scanner scanner = new Scanner(System.in);

    public UI(TeaService teaService, TypeOfTeaService typeOfTeaService, ManufacturerService manufacturerService) {
        this.teaService = teaService;
        this.typeOfTeaService = typeOfTeaService;
        this.manufacturerService = manufacturerService;

    }

    private void infoAllTea() {
        Tea[] teas = teaService.getAllTeas();
        for (Tea tea : teas) {
            System.out.println(tea);
        }
    }

    private void findByManufacturerName() {
        System.out.println("Available Tea Types");
        Manufacturer[] manufacturers1 = manufacturerService.getAll();
        for (Manufacturer manufacturer : manufacturers1) {
            System.out.println(" | Name : " + manufacturer.getName());
        }
        System.out.println("Enter your Manufacturer:");
        String manufacturer = scanner.nextLine();
        Manufacturer manufacturerByName = manufacturerService.getManufacturerByName(manufacturer);
        if (manufacturerByName!= null) {
            Tea[] teas = teaService.searchByManufacturer(manufacturerByName);
            for (Tea tea : teas) {
                System.out.println(tea);
            }
        } else  {
            System.out.println("Invalid Manufacturer");
        }
    }

    private void findByManufacturerId() {
        System.out.println("Available Tea Types");
        Manufacturer[] manufacturers1 = manufacturerService.getAll();
        for (Manufacturer manufacturer : manufacturers1) {
            System.out.println("ID: " + manufacturer.getId() + " | Name : " + manufacturer.getName());
        }
        System.out.println("Enter your Manufacturer id :");
        int id = scanner.nextInt();
        scanner.nextLine();
        Manufacturer manufacturerByName = manufacturerService.getManufacturerById(id);
        if (manufacturerByName!= null) {
            Tea[] teas = teaService.searchByManufacturer(manufacturerByName);
            for (Tea tea : teas) {
                System.out.println(tea);
            }
        } else  {
            System.out.println("Invalid Manufacturer");
        }
    }

    private void findByTypeOfTeaName() {
        System.out.println("Available Tea Types");
        TypeOfTea[] typeOfTeas = typeOfTeaService.getAllTypeOfTea();
        for (TypeOfTea typeOfTea : typeOfTeas) {
            System.out.println( " | Type  : " + typeOfTea.getTypeName());
        }
        System.out.println("Enter your Type:");
        String typeOfName = scanner.nextLine();
        TypeOfTea typeToTeaByName = typeOfTeaService.getTypeOfTeaByName(typeOfName);
        if (typeToTeaByName!= null) {
            Tea[] teas = teaService.searchByType(typeToTeaByName);
            for (Tea tea : teas) {
                System.out.println(tea);
            }
        } else  {
            System.out.println("Invalid Type");
        }
    }

    private void findByTypeId() {
        System.out.println("Available Tea Types");
        TypeOfTea[] typeOfTeas = typeOfTeaService.getAllTypeOfTea();
        for (TypeOfTea typeOfTea : typeOfTeas) {
            System.out.println("ID: " + typeOfTea.getId() + " | Type : " + typeOfTea.getTypeName());
        }
        System.out.println("Enter your Type id :");
        int id1 = scanner.nextInt();
        scanner.nextLine();
        TypeOfTea typeOfTeaId = typeOfTeaService.getTypeOfTeaById(id1);
        if (typeOfTeaId!= null) {
            Tea[] teas = teaService.searchByType(typeOfTeaId);
            for (Tea tea : teas) {
                System.out.println(tea);
            }
        } else  {
            System.out.println("Invalid Type Id");
        }
    }

    public void extraMenu() {
        while(true) {
            System.out.println("====*Find by Manufacturer*====");
            System.out.println("1. Find by Name");
            System.out.println("2. Find by Id");
            System.out.println("3. Back to Main Menu");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    findByManufacturerName();
                    break;
                case "2":
                    findByManufacturerId();
                    break;
                case "3":
                    printMenu();
                default:
                    System.out.println("Invalid Choice");
            }
        }

    }

    public void extraMenu2() {
        while(true) {
            System.out.println("====*Find by Type of Tea*====");
            System.out.println("1. Find by Name");
            System.out.println("2. Find by Id");
            System.out.println("3. Back to Main Menu");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    findByTypeOfTeaName();
                    break;
                case "2":
                    findByTypeId();
                    break;
                case "3":
                    printMenu();
                default:
                    System.out.println("Invalid Choice");
            }
        }

    }


    public void printMenu() {
        while(true){
            System.out.println("===*Tea Catalog*===");
            System.out.println("1. Info about all Tea");
            System.out.println("2.Search By Manufacturer");
            System.out.println("3. Search By Type");
            System.out.println("4. Exit Tea");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    infoAllTea();
                    break;
                case "2":
                    extraMenu();
                    break;
                case "3":
                    extraMenu2();
                    break;
                default:
                    System.out.println("Invalid Choice");

            }
        }

    }




}
