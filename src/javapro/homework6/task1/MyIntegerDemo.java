package javapro.homework6.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class MyIntegerDemo {
    public static void main(String[] args) {
        List<MyInteger> ints = new ArrayList<>();
        ints.add(new MyInteger(1));
        ints.add(new MyInteger(2));
        ints.add(new MyInteger(3));
        ints.add(new MyInteger(4));
        ints.add(new MyInteger(5));
        ints.add(new MyInteger(6));
        ints.add(new MyInteger(7));
        ints.add(new MyInteger(8));
        ints.add(new MyInteger(9));
        ints.add(new MyInteger(10));
        System.out.println(ints);
        ListIterator<MyInteger> intiterator = ints.listIterator();
        while (intiterator.hasNext()) {
            MyInteger myints = intiterator.next();
            System.out.println(myints);

            if (myints.getMyint() == 10) {
                System.out.println("Integer 10 found and deleted!");
                intiterator.remove();

            }


        }
        System.out.println(ints);



    }
}
