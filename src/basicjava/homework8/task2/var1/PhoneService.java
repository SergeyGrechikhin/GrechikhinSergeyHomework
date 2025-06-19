package basicjava.homework8.task2.var1;

import java.util.Scanner;

public class PhoneService {
    public void changevolume (Phone phone)  {


        System.out.println(" Выберите включить или выключить громкость! ");
        Scanner sc = new Scanner(System.in) ;
        boolean volume = sc.nextBoolean();
        phone.setSilent(volume);
        System.out.println(" Состояние громкости : " + volume);

        sc.close();
    }
}
