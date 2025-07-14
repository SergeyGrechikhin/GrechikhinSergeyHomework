package holidayWork.generic.task1;

import javax.swing.*;

public class MyItemDemo {
    public static void main(String[] args) {
       MyItem<String> stringBox = new MyItem<>();
       stringBox.put("hello");
        System.out.println(stringBox.get());


        MyItem<Integer> stringBox2 = new MyItem<>();
        stringBox2.put(781);
        System.out.println(stringBox2.get());


    }
}
