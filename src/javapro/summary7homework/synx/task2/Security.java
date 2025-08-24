package javapro.summary7homework.synx.task2;

import java.util.concurrent.Semaphore;

public class Security {
    public static void main(String[] args) {
        int humans = 10;
        Semaphore semaphore = new Semaphore(3);

        for (int i = 0; i < humans; i++) {
            int id = i;
            new Thread(() -> {
                try{
                    System.out.println("Человек " + id + "ждет досмотра");
                    semaphore.acquire();
                    System.out.println("Человек " + id + "проходит досмотр");
                    Thread.sleep(2000);
                    System.out.println("Человек " + id + "закончил досмотр");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    semaphore.release();
                }
            }).start();
        }
    }
}
