package javapro.homework15.task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Person2Demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age = 1;

        while(true){
            try{
                System.out.println("Enter your age");
                age = input.nextInt();
              if (age <= 0){
                  System.out.println("Invalid age , age can not be negative");
              } else {
                  break;
              }
            }catch(InputMismatchException e){
                System.out.println("Error , Enter Integer");
                input.nextLine();
            }
        }
        PersonTask2 person = new PersonTask2(age);
        System.out.println(person);

    }
}
