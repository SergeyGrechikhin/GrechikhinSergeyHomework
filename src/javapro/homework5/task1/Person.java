package javapro.homework5.task1;

import java.util.HashSet;
import java.util.Set;

public class Person {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        names.add("Alex");
        names.add("Bob");
        names.add("John");
        names.add("Jane");
        names.add("Julie");
        names.add("Kate");
        names.add("Kevin");
        names.add("Ken");
        names.add("Kevin");
        System.out.println("Unique Names: "+names.size());
        String nameToCompare = "Alex";
        if (names.contains(nameToCompare)) {
            System.out.println("Name found");
        } else  {
            System.out.println("Name not found");
        }


    }

}
