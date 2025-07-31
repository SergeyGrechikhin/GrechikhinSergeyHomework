package javapro.homework14.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("1");
        strings.add("2");
        strings.add("3");
        strings.add("4");
        strings.add("5");

      List<Integer> integers = strings.stream().map(s -> Integer.parseInt(s)).filter(en -> en % 2 == 0).collect(Collectors.toList());

        System.out.println(integers);
    }
}
