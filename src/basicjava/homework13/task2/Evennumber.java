package basicjava.homework13.task2;

import java.util.Scanner;

public class Evennumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Введите число до которого будет рассчитываться сумма четных чисел");
        int n = scanner.nextInt();
        int sum = 0 ;

        for (int i = 0; i <= n; i++) {

            if( i  % 2 == 0) {

                sum = sum + i ;

            }

        }
        System.out.println("Производится сумма целых чисел");
        System.out.println("Сумма всех четных чисел от 0 до " + n + " равна = " + sum );

    }
}
