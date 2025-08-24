package javapro.summary7homework.thread.task2;

public class Demo {
    public static void main(String[] args) {
        Traffic traffic = new Traffic();
        Thread cars = new Thread(traffic::carsRun);
        Thread humans = new Thread(traffic::humans);

        humans.start();
        cars.start();
    }
}
