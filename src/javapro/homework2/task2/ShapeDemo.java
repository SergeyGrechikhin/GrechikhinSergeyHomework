package javapro.homework2.task2;

import javapro.lesson1.inheritance.task2.Rectangle;

public class ShapeDemo {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Rechtangle(5,5),new Circle(5)
        };
        ShapeService  shapeService = new ShapeService();
        shapeService.printAreas(shapes);
    }
}
