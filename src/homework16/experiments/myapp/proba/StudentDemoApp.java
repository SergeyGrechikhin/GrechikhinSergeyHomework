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
            System.out.println("3. Добавить студента в группу");
            System.out.println("4. Показать все группы");
            System.out.println("0. Выход из программы");

            String mychoice = scanner.nextLine();


            switch (mychoice)  {
                case "1" :
                    manager.createGroups();
                    break ;
                case "2" :
                    manager.createAndAddStudent();
                    break;
                case "4" :
                    manager.printInfo();
                    break;
                case "3" :
                    manager.addStudenttoGroup();
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


