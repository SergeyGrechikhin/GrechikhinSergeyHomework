package basicjava.homework7.task1;

import java.util.Scanner;

public class Employeedemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.println(" Введите данные о работникe . ");

        System.out.println("Имя работника : ");
        String name = scanner.nextLine() ;

        System.out.println("Количество часов за месяц : ");
        int hoursworked = scanner.nextInt();

        System.out.println("Какая почасавая ставка : ");
        double hourlyrate = scanner.nextDouble();

        System.out.println("Месячная зарплата : ");
        double mothlysalary = hoursworked * hourlyrate ;

        Employee employee = new Employee(name,hoursworked,hourlyrate,mothlysalary) ;
        System.out.println(employee);

        scanner.close();
    }
}
