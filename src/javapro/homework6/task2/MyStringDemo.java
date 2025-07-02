package javapro.homework6.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class MyStringDemo {
    public static void main(String[] args) {
        List<MyString> list = new ArrayList<>();
        list.add(new MyString("Apple"));
        list.add(new MyString("Sun"));
        list.add(new MyString("Google"));
        list.add(new MyString("Steam"));
        System.out.println("Before : " + list);
        ListIterator<MyString> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
                MyString mystrings = listIterator.next();
                if (mystrings.getMystring().contains("a") || mystrings.getMystring().contains("A")) {
                    listIterator.set(new MyString("..."));
                }

        }
        System.out.println("After : " + list);
    }
}
