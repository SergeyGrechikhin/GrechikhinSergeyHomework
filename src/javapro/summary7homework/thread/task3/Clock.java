package javapro.summary7homework.thread.task3;

public class Clock {

    private final Object lock = new Object();

    public void sleep() {
        synchronized (lock) {
            try {
                System.out.println("Сплю");
                lock.wait();
                System.out.println("Проснулся");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void wakeUp() {
        synchronized (lock) {
            System.out.println("Будильник звонит!");
            lock.notify();
        }
    }

}
