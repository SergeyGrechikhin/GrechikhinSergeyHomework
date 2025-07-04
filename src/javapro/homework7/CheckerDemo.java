package javapro.homework7;

public class CheckerDemo {
    public static void main(String[] args) {
        String brackets1 = "({[]})";
        String brackets2 = "{[()]})";
        String brackets3 = "({[)]}";
        System.out.println("brackets1: " + Checker.isValid(brackets1));
        System.out.println("brackets2: " + Checker.isValid(brackets2));
        System.out.println("brackets3: " + Checker.isValid(brackets3));
    }
}
