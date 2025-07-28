package javapro.homework12.task2;

public class SumInteger {
    public static void main(String[] args) {
        SumIntegerInterface sumInteger = (a,b) -> a+b;
         int sumAllInteger = sumInteger.sum(1,2);
        System.out.println(sumAllInteger);
    }


}
