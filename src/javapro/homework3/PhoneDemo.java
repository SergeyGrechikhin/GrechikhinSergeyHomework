package javapro.homework3;

import java.util.ArrayList;

public class PhoneDemo {
    public static void main(String[] args) {

        ArrayList<Phone> phones = new ArrayList<>();


        System.out.println("Free Array ");
        System.out.println(phones);
        System.out.println("====================");



        phones.add(new Phone("Iphone", "X5"));
        System.out.println(phones);
        phones.add(new Phone("Samsung", "Galaxy"));
        phones.add(new Phone("Samsung", "Space X"));
        phones.add(new Phone("Meizu", "G20"));
        phones.add(new Phone("Xaomi", "S8"));
        System.out.println(phones);

        phones.remove(1);
        System.out.println(phones);

        phones.remove(new Phone("Iphone", "X5"));
        System.out.println(phones);


    }

}
