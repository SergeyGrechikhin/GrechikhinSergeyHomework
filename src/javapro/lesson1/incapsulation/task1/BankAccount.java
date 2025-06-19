package javapro.lesson1.incapsulation.task1;

public class BankAccount {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void deposit(double plusmoney) {
        if (plusmoney > 0) {
            balance += plusmoney ;
        }else {
            System.out.println("Insufficient money");
        }
    }

    public void withdraw(double minusmoney) {
if (minusmoney > 0) {
     balance -= minusmoney;
}else  {
        System.out.println("Insufficient money");
}
    }
}
