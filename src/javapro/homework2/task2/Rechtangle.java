package javapro.homework2.task2;

public class Rechtangle implements Shape {
    private double width;
    private double height;

    public Rechtangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
