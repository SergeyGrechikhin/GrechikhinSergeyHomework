package homework12.task3;

import java.util.Scanner;

public class Myday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Введите номер дня недели по счету от 1 до 7 !");
        int myday = scanner.nextInt() ;

        switch (myday)  {
            case 1:
                System.out.println("Ваш день понедельник ");
                break;
            case 2:
                System.out.println("Ваш день вторник ");
                break;
            case 3:
                System.out.println("Ваш день среда ");
                break;
            case 4:
                System.out.println("Ваш день четверг ");
                break;
            case 5:
                System.out.println("Ваш день пятница ");
                break;
            case 6:
                System.out.println("Выходной");
                break;
            case 7:
                System.out.println("Выходной");
                break;
        }
    }
}
