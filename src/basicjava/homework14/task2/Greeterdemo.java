package basicjava.homework14.task2;

import java.util.Scanner;

public class Greeterdemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        Greeter greeter = new Greeter();
        System.out.println(" Запускается протокол приветствия . ");
        System.out.println(" Как вас зовут? ");
        String myname = scanner.nextLine();
        System.out.println(" Ckолько раз вас нужно привествовать ");
        int mycounter = scanner.nextInt();
        greeter.greet(myname,mycounter);
    }
}
