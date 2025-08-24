package javapro.summary7homework.synx.task3;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ThreadLocalRandom;

public class Cinema {
    public static void main(String[] args) {
        int friends = 4;
        CyclicBarrier barrier = new CyclicBarrier(friends, () ->
                System.out.println("Все здесь . Идем смотреть фильм"));

        for (int i = 0; i < friends; i++) {
            int id = i ;
            Thread t = new Thread(() -> {
                try {
                    Thread.sleep(ThreadLocalRandom.current().nextInt(500, 2000));
                    System.out.println(" Друг " + id + " пришел к входу и ждет ");
                    barrier.await();
                    System.out.println(" Друг " + id + " прошел внутрь ");
                }catch (Exception e){
                }
            });
            t.start();

        }
    }
}
