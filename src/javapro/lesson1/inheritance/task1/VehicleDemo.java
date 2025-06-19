package javapro.lesson1.inheritance.task1;

public class VehicleDemo {
    public static void main(String[] args) {
        Car car = new Car("Car","Black",true);
        System.out.println(car);
        car.Peculiarities("My Peculiarities is : I need Benzine");
        Bicycle bicycle = new Bicycle("Bicycle","Red",false,"Carbon");
        System.out.println(bicycle);
        bicycle.Peculiarities("My Peculiarities is : I need not benzine and my material Carbon");
    }


}
