package basicjava.homework6.task4;

public class Rectangledemo {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle() ;
        rectangle1.area(4,5);
        rectangle1.perimeter(4,5);


        System.out.println("------------------");
        System.out.println("Второй способ");


        double resultarea = rectangle1.area1(4,5);
        rectangle1.resultarea("Нахождение площади прямоугольника " , resultarea);
        double resultperimeter = rectangle1.perimeter1(4,5) ;
        rectangle1.resultperimeter("Нахождение периметра прямоугольника ",resultperimeter);
    }
}
