package basicjava.homework6.task4;

public class Rectangle {
    double result;



    public void area(double x , double y) {
        result = x * y ;
        System.out.println(" Площадь треугольника равна : " + result);
    }

    public void perimeter(double x , double y) {
        result = 2 * (x+y) ;
        System.out.println(" Периметр треугольника равен : " + result);

    }

    public double area1(double a , double b) { //второй способ
        double resultarea = a * b ;
        return resultarea ;

    }

    public double perimeter1(double a , double b) {
        double resultperimeter = 2 * (a+b) ;
        return resultperimeter;
    }

    public void resultarea(String typeoperation , double resultarea ) {
        System.out.println(" Тип операции " + typeoperation + " равна : " + resultarea);
    }
    public void resultperimeter(String typeoperation , double resultperimeter ) {
        System.out.println(" Тип операции " + typeoperation + " равна : " + resultperimeter);
    }

}
