package javapro.homework21.task1;

public class HelloTreadRun implements Runnable{
    String message;

    public HelloTreadRun(String message) {
        this.message = message;
    }

    public void run(){
        for(int j=0;j<5;j++){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(message);
        }

    }
}
