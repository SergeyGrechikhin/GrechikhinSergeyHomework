package javapro.teaproject.UI;

import javapro.teaproject.entity.Tea;
import javapro.teaproject.service.TeaService;

import java.sql.SQLOutput;
import java.util.Scanner;

public class UI {
    private TeaService teaService;
    private Scanner scanner = new Scanner(System.in);

    public UI(TeaService teaService) {
        this.teaService = teaService;
    }


    public void infoAboutAllTeas(){
        Tea[] teas = teaService.getAllTeas();
        printTeas(teas);
    }

    public void searchByManufacturer(){
        System.out.println("Enter Manufacturer Name: ");
        String manufacturer = scanner.nextLine();
        Tea[] teas = teaService.searchByManufacturer(manufacturer);
        printTeas(teas);
    }

    public void searchByType(){
        System.out.println("Enter Type of Tea: ");
        String type = scanner.nextLine();
        Tea[] teas = teaService.searchByType(type);
        printTeas(teas);
    }

    public void printTeas(Tea[] teas){
        if (teas.length  == 0) {
            System.out.println("Teas not found");
        } else {
            for (int i = 0; i < teas.length; i++) {
                System.out.println(teas[i]);
            }
        }
    }

    public void printMenu(){
        System.out.println("===*Tea Catalog*===");
        System.out.println("1. Info about all Tea");
        System.out.println("2.Search By Manufacturer");
    System.out.println("3. Search By Type");
        System.out.println("4. Exit Tea");
    }

    public void exitProgramm() {
        System.out.println("Exit");
    }

    public void invalidUserChoise() {
        System.out.println("Invalid User choise");
    }

    public void startProgramm() {
        teaService.addDataBase();
        boolean start = true;

        while (start) {
            printMenu();
            String userchoice = scanner.nextLine();
            switch (userchoice) {
                case "1":
                    infoAboutAllTeas();
                    break;
                    case "2":
                        searchByManufacturer();
                        break;
                        case "3":
                            searchByType();
                            break;
                            case "4":
                                exitProgramm();
                                start = false;
                default:
                    invalidUserChoise();
            }
        }

    }


}
