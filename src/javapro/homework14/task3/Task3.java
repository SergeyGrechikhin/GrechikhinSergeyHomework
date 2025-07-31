package javapro.homework14.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Hi");
        strings.add("this");
        strings.add("is");
        strings.add("Java");

        String stringsTogether = strings.stream().collect(Collectors.joining(" "));
        System.out.println(stringsTogether);
    }
}
