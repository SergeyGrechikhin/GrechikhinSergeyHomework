package javapro.homework15.task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Please enter your first Integer : ");
        int x = sc.nextInt();
        sc.nextLine();
        System.out.println("Please enter your second Integer : ");
        int y = sc.nextInt();
        sc.nextLine();


        try {
            System.out.println("Result : "  + divide(x, y));
        } catch (ArithmeticException newExceptionObject){
            System.out.println("Error : " + newExceptionObject.getMessage());
        }

        System.out.println("Exit");

    }

    static double divide(int x, int y) {
        return x / y;
    }
    }

