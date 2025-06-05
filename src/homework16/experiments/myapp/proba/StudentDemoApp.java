package homework16.experiments.myapp.proba;

import java.util.Scanner;

public class StudentDemoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        GroupManager manager = new GroupManager();


        while(true) {
            System.out.println(" \n===*Меню*=== ");
            System.out.println("1. Добавить в базу данных группу/группы");
            System.out.println("2. Добавить базу данных студента/студентов ");
            System.out.println("3. Управление студентами");
            System.out.println("4. Показать все группы");
            System.out.println("0. Выход из программы");

            String mychoice = scanner.nextLine();


            switch (mychoice)  {
                case "1" :
                    manager.createGroups();
                    break ;
                case "2" :
                    manager.createStudent();
                    break;
                case "4" :
                    manager.printInfo();
                    break;
                case "3" :
                    while (true) {
                        System.out.println("\n===*Управление студентами*===");
                        System.out.println("1. Добавить студента в группу");
                        System.out.println("2. Переместить студента в другую группу");
                        System.out.println("0. Назад в главное меню");
                        String mydoublechoice = scanner.nextLine();
                        switch (mydoublechoice) {
                            case "1" :
                                manager.addStudenttoGroup();
                                break;
                                case "2" :manager.MovetoGroup();
                                break;
                                case "0" :
                                    System.out.println("Возвраст в главное меню");
                                    break;
                            default:
                                System.out.println("Вы что то сделали не так");
                        }
                        if (mydoublechoice.equals("0")) {
                            break;
                        }
                    }
                    break;

                case "0" :
                    System.out.println("Завершение программы");
                    return;


                default :
                    System.out.println("Вы сделали что то не так!");


            }
        }


    }
}


