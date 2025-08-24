package javapro.summary7homework.easyhomework.task3;

import javapro.summary7homework.easyhomework.task1.Teapot;

import java.beans.Customizer;

public class Taxi {
    public static void main(String[] args) throws InterruptedException {
        Сustomer customer = new Сustomer();
        Thread taxi = new Thread(new TaxiFahrer()) ;

        customer.start();
        Thread.sleep(1000);
        taxi.start();
        customer.join();
        taxi.join();
        System.out.println("Приехали на место");
    }

    private static Object lock = new Object();
    private static boolean flag = false;

    static class TaxiFahrer implements Runnable {
        public void run() {
            System.out.println("Еду к клиенту!");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            synchronized (lock) {
                flag = true;
                System.out.println("Приехал на место");
                lock.notify();
            }
        }
    }

    static class Сustomer extends Thread {
        public void run() {
            synchronized (lock) {
                try {
                    System.out.println("Клиент : жду такси! ");
                    lock.wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                System.out.println("Выдвигаюсь на адрес!!! ");
            }
        }
    }
}
