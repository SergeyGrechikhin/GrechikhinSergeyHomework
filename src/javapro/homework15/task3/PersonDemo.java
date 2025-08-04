package javapro.homework15.task3;

import java.util.Scanner;

public class PersonDemo {
    private static Scanner scanner ;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        int age = readInt("Enter your age");
        Person person = new Person(age);
        System.out.println(person);
    }
    private static int readInt(String prompt){
        while (true){
            System.out.println(prompt);
            String input = scanner.nextLine();
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e){
                System.out.println("Invalid input . Enter only integer");
            }
        }
    }
}
