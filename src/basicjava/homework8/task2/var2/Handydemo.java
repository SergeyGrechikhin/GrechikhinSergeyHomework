package basicjava.homework8.task2.var2;

import java.util.Scanner;

public class Handydemo {
    public static void main(String[] args) {
        Handy handy = new Handy("Iphone 15","White",true) ;
        System.out.println(handy);
        System.out.println("Включить или выключить вашу громкость : ");
        Scanner sc = new Scanner(System.in) ;
        boolean myvolume = sc.nextBoolean() ;
        handy.setSilent(myvolume);
        System.out.println(handy);
        System.out.println("Состояние громкости : " + myvolume );
        sc.close();
    }
}
