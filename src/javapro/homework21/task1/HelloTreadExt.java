package javapro.homework21.task1;

public class HelloTreadExt extends Thread {
    String message ;

    public HelloTreadExt(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(message);
        }

    }
}
