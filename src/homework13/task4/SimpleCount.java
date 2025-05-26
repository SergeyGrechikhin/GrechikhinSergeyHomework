package homework13.task4;

import java.util.Scanner;

public class SimpleCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Введите число которое будет проверяться простое оно или нет ");
        int n = scanner.nextInt() ;
        int count = 0 ;

        for (int i = 2; i < n ; i++) {

            if (n % i == 0) {
                count++;
            }
        }
        if (n <= 1) {
            System.out.println("Число не простое");
        } else if (count == 0) {
            System.out.println("Число простое");
        } else {
            System.out.println("Число не простое");
        }

        }

        }


