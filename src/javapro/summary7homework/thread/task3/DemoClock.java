package javapro.summary7homework.thread.task3;

public class DemoClock {
    public static void main(String[] args) throws InterruptedException {
        Clock clock = new Clock();
        Thread sleep = new Thread(clock::sleep);
        Thread wakeup = new Thread(clock::wakeUp);
        sleep.start();
        Thread.sleep(2000);
        wakeup.start();
    }
}
