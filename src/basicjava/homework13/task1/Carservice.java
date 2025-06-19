package basicjava.homework13.task1;

import java.util.Scanner;

public class Carservice {
    public Car createcar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give your producer name");
        String producer = scanner.nextLine();
        System.out.println("Give your model ");
        String model = scanner.nextLine();
        System.out.println("Give your power");
        int power = scanner.nextInt();
        Car car = new Car(producer,power,model) ;
        return car;
    }
}
