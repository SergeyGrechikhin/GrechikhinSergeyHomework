package homework9;

public class Cardemo {
    public static void main(String[] args) {
        CarService carService = new CarService() ;
        Prodcar prodcar1 = carService.createprodcar();
        Car newcar1 = carService.createcar(prodcar1);
        System.out.println(newcar1);

        System.out.println("--------------------");

        Prodcar prodcar2 = carService.createprodcar();
        Car newcar2 = carService.createcar(prodcar2);
        System.out.println(newcar2);

        System.out.println("---------------------");

        Car newcar3 = carService.createcar(prodcar2);
        System.out.println(newcar3);

    }
}
