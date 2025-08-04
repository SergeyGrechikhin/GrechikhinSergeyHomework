package javapro.homework15.task5;

import java.util.Scanner;

public class PersonDemoTask5 {
    private static Scanner scanner ;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        int age = readInt("Enter your age");
        PersonTask5 person = new PersonTask5(age);
        System.out.println(person);
    }
    private static int readInt(String prompt){
        while (true){
            System.out.println(prompt);
            String input = scanner.nextLine();
            try {
                int value = Integer.parseInt(input);
                if (value < 0){
                    System.out.println("Please enter a positive integer");
                    continue;
                }
                return Integer.parseInt(input);
            } catch (NumberFormatException e){
                System.out.println("Invalid input . Enter only integer");
            }
        }
    }
}
