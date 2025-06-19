package javapro.homework2.task2;

public class ShapeService {
    public void printAreas(Shape[] shapes) {
        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Shape " + (i + 1) + ": " + shapes[i].getArea());
        }
    }
}
