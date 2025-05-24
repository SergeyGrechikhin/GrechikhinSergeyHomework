package homework12.task1var1;

import java.util.Scanner;

public class Myint123 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Введите число от 1 до 3 !");
        int myint = scanner.nextInt() ;

        if ( myint == 1 ) {
            System.out.println("Ваше число 1!");
        } else if (myint == 2) {
            System.out.println("Ваше число 2!") ;
        } else if (myint == 3){
            System.out.println("Ваше число 3!");
        } else if (myint  >= 4) {
            System.out.println("Вы ввели число не из списка!!!!");
        }
    }
}
