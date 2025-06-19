package javapro.lesson1.inheritance.task2;

public class Rectangle extends Shape {
    private double sideA;
    private double sideB;

    public Rectangle(String title, double sideA, double sideB) {
        super(title);
        this.sideA = sideA;
        this.sideB = sideB;
    }



    @Override
    public double calculateArea() {
        return 2 * sideA * sideB;
    }
}
