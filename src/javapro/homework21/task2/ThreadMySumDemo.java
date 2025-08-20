package javapro.homework21.task2;

public class ThreadMySumDemo {
    public static void main(String[] args) {
        ThreadMySum sum1 = new ThreadMySum(1,50);
        ThreadMySum sum2 = new ThreadMySum(51,100);

        sum1.start();
        sum2.start();

        try {
            sum1.join();
            sum2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int totalSum = sum1.getResult() + sum2.getResult();
        System.out.println("Total Sum is: " + totalSum);
    }
}
