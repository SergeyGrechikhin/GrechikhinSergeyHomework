package basicjava.homework14.task1;

import java.util.Scanner;

public class MyltiEvenCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = 1 ;
        boolean findevencount = false ;

        while (true) {
            System.out.println("Введите ваше число ! (Если хотите завершить операцию то введите 0) " );
            int number = scanner.nextInt();

            if (number == 0) {
                break;
            }
            if (number % 2 == 0) {
                result *= number;
                findevencount = true ;
            }
        }
        if (findevencount) {
            System.out.println(" Результат умножения только четных чисел равен : " + result);
        } else {
            System.out.println("Вы ввели не одного четного числа ");
        }
    }
}
