package javapro.lesson1.incapsulation.task1;

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        System.out.println("My Money");
        System.out.println(bankAccount.getBalance());
        System.out.println("I give for my balance 1000 Euro");
        bankAccount.deposit(1000);
        System.out.println(bankAccount.getBalance());
        System.out.println("I take 300 Euro");
        bankAccount.withdraw(300);
        System.out.println("My Money");
        System.out.println(bankAccount.getBalance());
    }
}
