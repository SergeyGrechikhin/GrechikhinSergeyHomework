package javapro.homework21.task3;

public class Counter {
    public static void main(String[] args) {
        Thread counter = new Thread(new CounterMy());

        counter.start();

        try {
            counter.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Let's go");
    }

    static class CounterMy implements Runnable {
        public void run() {
            for(int i=10;i>=1;i--){
                System.out.println(i);
                try{Thread.sleep(1000);
                }catch(InterruptedException e){
                    System.out.println(e);
                }

            }
        }
    }
}
