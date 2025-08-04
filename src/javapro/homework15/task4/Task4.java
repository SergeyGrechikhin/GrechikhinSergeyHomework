package javapro.homework15.task4;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Random rand=new Random();

        System.out.println("Enter your ArraySize");
        int arraySize=input.nextInt();
        input.nextLine();
        int[] numbers=new int[arraySize];
        for(int i=0;i<arraySize;i++){
            numbers[i]=rand.nextInt(10);
        }
        System.out.println("Array Elements");
        for (int number : numbers) {
            System.out.println(number);
        }

        while(true){
            System.out.println("Enter your Array Elements");
            int arrayElement=input.nextInt();
            input.nextLine();
            try {
                int value = numbers[arrayElement];
                System.out.println("Index " + arrayElement + " : " + value);
                break;
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Index Out of Bounds");
            }
        }

    }


}
