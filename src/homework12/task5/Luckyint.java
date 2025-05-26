package homework12.task5;

import java.util.Scanner;

public class Luckyint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.println(" Введите четырёхзначное число ! ");
        String myint = scanner.nextLine() ;

        if (myint.length() !=4 ){
            System.out.println("Вы ввели не правильно . Нужно четырёхзначное целое число !");
        }else{
            int mychar = myint.charAt(0) - '0' ;
            int mychar1 = myint.charAt(1) - '0' ;
            int mychar2 = myint.charAt(2) - '0' ;
            int mychar3 = myint.charAt(3) - '0' ;

            int sum1 = mychar + mychar1 ;
            int sum2 = mychar2 + mychar3 ;

            System.out.println("Cумма первых двух чисел : " + sum1);
            System.out.println("Cумма первых двух чисел : " + sum2);

            if (sum1 == sum2) {
                System.out.println("Билет счастливый");
            } else {
                System.out.println("Билет несчастливый");
            }



        }
    }
}
