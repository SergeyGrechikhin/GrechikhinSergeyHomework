package javapro.summary7homework.synx.task1;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadLocalRandom;

public class Speed {
    public static void main(String[] args) throws InterruptedException {
        int runs = 5;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        for (int i = 0; i < runs; i++) {
            int id = i;
            new Thread(() -> {
                try {
                    Thread.sleep(ThreadLocalRandom.current().nextInt(500, 2000));
                    System.out.println("Бегун" + id + "готов и ждет старта");
                    countDownLatch.await();
                    System.out.println("Бегун" + id + "побежал");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
        Thread.sleep(1000);
        System.out.println("Судья : На старт");
        Thread.sleep(700);
        System.out.println("Судья : Внимание ");
        Thread.sleep(700);
        System.out.println("Cудья : Марш");
        countDownLatch.countDown();
    }

}
