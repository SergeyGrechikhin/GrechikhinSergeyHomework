package homework12.task5.var2;

import java.util.Scanner;

public class Luckyinteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.println(" Введите четырёхзначное число ! ");
        String myint = scanner.nextLine() ;

        if (myint.length() !=4  ){
            System.out.println("Вы ввели не правильно . Нужно четырёхзначное число !");


        }else {
            int leftsum = Character.getNumericValue(myint.charAt(0)) + Character.getNumericValue(myint.charAt(1)) ;
            int rightsum = Character.getNumericValue(myint.charAt(2)) + Character.getNumericValue(myint.charAt(3)) ;



            System.out.println("Cумма первых двух чисел : " + leftsum);
            System.out.println("Cумма первых двух чисел : " + rightsum);

            if (leftsum == rightsum) {
                System.out.println("Ваше число счастливое");
            } else {
                System.out.println("Ваше число не счастливое");
            }



        }

}


}
