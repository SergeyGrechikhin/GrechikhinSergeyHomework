package homework8.task3;

import java.util.Scanner;

public class LightService {
    public void changelampe (Light light) {
        System.out.println(" Введите данные о включение света( Включить свет да / нет ) ? ");
        Scanner sc = new Scanner(System.in) ;
        boolean islighton = sc.nextBoolean() ;
        light.setOn(islighton);
        System.out.println(" Свет включен ? : " + islighton);
        System.out.println(" Введите какой процент яркости должен быть (От 0 до 100) : ");
        int lightpercent = sc.nextInt();
        light.setBrightness(lightpercent);
        System.out.println(" Яркость лампы выставлена на " + lightpercent + " Процентов ");

        sc.close();


    }

}
