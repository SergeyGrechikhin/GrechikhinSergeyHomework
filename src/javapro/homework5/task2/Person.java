package javapro.homework5.task2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Person {
    public static void main(String[] args) {
        List<String> names =new ArrayList<>();
        names.add("John");
        names.add("Jane");
        names.add("Jack");
        names.add("Jack");
        names.add("Alex");
        names.add("Kate");
        names.add("Anna");
        System.out.println(names);
        HashSet<String> namesUnique =new HashSet<>(names);
        System.out.println(namesUnique);
        namesUnique.add("Oleg");
        namesUnique.add("Victor");
        List<String> finalNames =new ArrayList<>(namesUnique);
        System.out.println(finalNames);

    }
}
