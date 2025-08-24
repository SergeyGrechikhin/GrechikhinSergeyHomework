package javapro.summary7homework.easyhomework.task1;

public class Teapot {
    public static void main(String[] args) throws InterruptedException {
        Cup cup = new Cup();
        Thread kettle  = new Thread(new Kettle());

        cup.start();
        Thread.sleep(1000);
        kettle.start();
        cup.join();
        kettle.join();
        System.out.println("Чай готов");

    }

    private static Object lock = new Object();
    private static boolean flag = false;

    static class Kettle implements Runnable {
        public void run() {
            System.out.println("Чайник : кипячу воду 3 секунды ");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            synchronized (lock) {
                flag = true;
                System.out.println("Чайник : вода вскипела");
                lock.notify();
            }
        }
    }

    static class Cup extends Thread {
        public void run() {
            synchronized (lock) {
                try {
                    System.out.println("Чашка : жду горячую воду ");
                    lock.wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                System.out.println("Чашка : наливаю чай");
            }
        }
    }
}
