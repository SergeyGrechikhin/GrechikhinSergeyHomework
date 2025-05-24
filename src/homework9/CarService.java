package homework9;

import java.util.Scanner;

public class CarService {
    public Prodcar createprodcar () {
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Дайте Информацию о марке машины ");
        String mydescription = scanner.nextLine();
        System.out.println("Дайте Информацию о стране машины ");
        String mycountry = scanner.nextLine() ;

        Prodcar prodcar = new Prodcar(mydescription,mycountry);
        return  prodcar ;
    }

    public Car createcar(Prodcar prodcar) {
        Scanner scanner1 = new Scanner(System.in) ;
        System.out.println("Дайте Информацию о модели машины ");
        String mymodel = scanner1.nextLine();
        System.out.println("Дайте Информацию о цвете машины ");
        String mycolor = scanner1.nextLine() ;

        Car car = new Car (mymodel,mycolor,prodcar) ;
        return car ;

    }
}
