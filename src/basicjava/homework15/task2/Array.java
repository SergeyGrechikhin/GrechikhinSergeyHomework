package basicjava.homework15.task2;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        System.out.println("Задание №2.\n" +
                "\n" +
                "1.\tСоздайте массив из 5 случайных целых чисел из интервала [10;99]\n" +
                "2.\tВыведите его на консоль в строку.\n" +
                "3.\tОпределите и выведите на экран сообщение о том, является ли массив строго возрастающей последовательностью.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сколько чисел должно быть в массиве! ");
        int counter = scanner.nextInt();
        int[] myarray = new int[counter] ;
        boolean isseries = true ;

        for (int i = 0; i < myarray.length; i++) {
            System.out.println("Введите ваше число");
            myarray[i] = scanner.nextInt();

        }
        System.out.println("Ваш массив");
        System.out.println(Arrays.toString(myarray));

        for (int i = 0; i < myarray.length-1; i++) {
            if (myarray[i] >= myarray[i+1])  {
                isseries = false;
                break;

            }
        }

        if (isseries) {
            System.out.println("Ваши числа в массиве идут по возврастанию ");
        } else {
            System.out.println("Ваши числа в массиве идут не по возврастанию");
        }


    }

}
