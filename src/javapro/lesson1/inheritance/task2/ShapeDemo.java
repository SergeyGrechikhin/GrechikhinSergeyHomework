package javapro.lesson1.inheritance.task2;

public class ShapeDemo {
    public static void main(String[] args) {

        Circle circle = new Circle("Circle",5);
        Rectangle rectangle = new Rectangle("Rectangle",5,5);
        Triangle triangle = new Triangle("Triangle",5,5,3);

         circle.calculateArea();
         rectangle.calculateArea();
         triangle.calculateArea();
        System.out.println("The area of the circle is: " + circle.calculateArea());
        System.out.println("The area of the rectangle is: " + rectangle.calculateArea());
        System.out.println("The area of the triangle is: " + triangle.calculateArea());








    }
}
