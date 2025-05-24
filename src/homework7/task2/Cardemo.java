package homework7.task2;

import java.util.Scanner;

public class Cardemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Введите данные о автомобиле . ");
        System.out.println("Введите данные о бренде автомобиля : ");
        String brand = scanner.nextLine() ;
        System.out.println("Введите данные о моделе автомибиля : ");
        String model = scanner.nextLine();
        System.out.println("Введите данные о расходе топлива на 100 км : ");
        double  fuelconsumption = scanner.nextDouble() ;
        System.out.println("Введите данные о объеме топливного бака автомобиля : ");
        double  fueltankcapacity = scanner.nextDouble() ;
        //Максимальная дистанция которую пройдет автомобиль на полном баке
        double maxdistance = fueltankcapacity * 100 / fuelconsumption ;

        Car car = new Car(brand,model,fuelconsumption,fueltankcapacity,maxdistance) ;
        System.out.println(car);

        scanner.close();

    }
}
