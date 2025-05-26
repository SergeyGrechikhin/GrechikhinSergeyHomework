package homework13.task3;

import java.util.Scanner;

public class EvenandOddCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Введите число до которого будет рассчитываться количество четных и нечетных чисел");
        int n = scanner.nextInt() ;
        int evencount = 0;
        int oddcount = 0;

        for (int i = 0; i < n ; i++) {

            if ( i % 2 == 0) {
                evencount++ ;
            } else {
                oddcount++;

            }
        }
        System.out.println("Кол-во чётных чисел от 0 до " + n + " : " + evencount);
        System.out.println("Кол-во нёчетных чисел от 0 до " + n + " : " + oddcount);

    }

}
