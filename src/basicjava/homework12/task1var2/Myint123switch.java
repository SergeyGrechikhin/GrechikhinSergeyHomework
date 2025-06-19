package basicjava.homework12.task1var2;

import java.util.Scanner;

public class Myint123switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Введите ваше число от 1 до 3 !");
        int myint = scanner.nextInt() ;

        switch (myint)  {
            case 1:
                System.out.println("Ваше число 1 ");
                break;
            case 2:
                System.out.println("Ваше число 2 ");
                break;
            case 3:
                System.out.println("Ваше число 3 ");
                break;

            default:
                System.out.println("Введено не правильное число которого нет в списке");
                return;


        }
    }
}
