package javapro.homework21.task2;

public class ThreadMySum extends Thread{
    private  int startNum ;
    private  int endNum ;
    private int result;

    public ThreadMySum(int startNum, int endNum) {
        this.startNum = startNum;
        this.endNum = endNum;
    }

    @Override
    public void run() {
        for(int i=startNum; i<=endNum; i++){
            result += i;
        }
        System.out.println("Sum : " +result);
    }

    public int getResult() {
        return result;
    }
}
