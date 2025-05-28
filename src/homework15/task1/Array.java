package homework15.task1;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in) ;
        System.out.println("Задание №1\n" +
                "\n" +
                "1.\tСоздайте массив из 8 случайных целых чисел из интервала [1;50]\n" +
                "2.\tВыведите массив на консоль в строку.\n" +
                "3.\tЗамените каждый элемент с нечетным индексом на ноль.\n" +
                "4.\tСнова выведете массив на консоль в отдельной строке.\n");
        System.out.println(" Введите сколько чисел должно быть в массиве ");
        int counter = scanner.nextInt();
        scanner.nextLine();

            int[] array = new int [counter];

        for (int i = 0; i < array.length; i++) {
            System.out.println(" Введите ваше число ");
            array[i] = scanner.nextInt();

        }
        System.out.println("Ваш полученный массив");
        System.out.println(Arrays.toString(array));



        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1 ) {
                array[i] = 0 ;
            }
        }
        System.out.println("Ваш второй полученный массив . Все нечетные числа были заменены на ноль");
        System.out.println(Arrays.toString(array));



    }
}
