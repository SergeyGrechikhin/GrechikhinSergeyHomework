package basicjava.homework12.task2;

import java.util.Scanner;

public class Maxint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Дай своё первое число ! " );

        int myfirstint = scanner.nextInt();

        System.out.println(" Дай своё второй число ! ");

        int mysecondint = scanner.nextInt();

        System.out.println(" Дай своё третье число ! ");

        int mythirdint = scanner.nextInt();

        System.out.println(" Дай своё третье число ! ");

        int myfourint = scanner.nextInt();

        if (myfirstint > mysecondint && myfirstint > mythirdint && myfirstint > myfourint  ) {
            System.out.println("Первое число максимальное");

        } else if (mysecondint > myfirstint && mysecondint > mythirdint && mysecondint > myfourint ) {
            System.out.println("Второе число  максильное ");

        } else if (mythirdint > myfirstint && mythirdint > mysecondint && mythirdint > myfourint ){
            System.out.println("Третье число максимальное");


        }else if (myfourint > myfirstint && myfourint > mysecondint && myfourint> myfirstint){
            System.out.println("Четвертое число максимальное");

        } else {
            System.out.println("Все числа равны");
        }
    }
}
