package javapro.lesson1.inheritance.task2;

public class Triangle extends Shape {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(String title, double sideA, double sideC, double sideB) {
        super(title);
        this.sideA = sideA;
        this.sideC = sideC;
        this.sideB = sideB;
    }



    @Override
    public double calculateArea() {
        double area = (sideA + sideB + sideC) / 2;
        return Math.sqrt(area + (area - sideA) * (area - sideB) * (area - sideC));
    }
}
