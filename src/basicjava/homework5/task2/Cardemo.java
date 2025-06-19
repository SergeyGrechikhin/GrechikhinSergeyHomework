package basicjava.homework5.task2;

public class Cardemo {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.brand = "BWM" ;
        car1.model = "X5" ;
        car1.year = 2010 ;
        car1.mileage = 100000 ;

        System.out.println("Бренд автомобиля : " + car1.brand);
        System.out.println("Модель автомобиля : " + car1.model);
        System.out.println("Год автомобиля : " + car1.year);
        System.out.println("Киллометраж автомобиля : " + car1.mileage + " KM ");

        System.out.println("-------------------------------------------------------------");

        Car car2 = new Car();
        car2.brand = "KIA" ;
        car2.model = "Stinger" ;
        car2.year = 2018 ;
        car2.mileage = 50000 ;

        System.out.println("Бренд автомобиля : " + car2.brand);
        System.out.println("Модель автомобиля : " + car2.model);
        System.out.println("Год автомобиля : " + car2.year);
        System.out.println("Киллометраж автомобиля : " + car2.mileage + " KM ");

    }
}
