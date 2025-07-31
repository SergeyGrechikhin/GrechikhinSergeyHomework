package javapro.homework14.task6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PersonDemo {
    public static void main(String[] args) {
        List<PersonTask6> personTask6List = new ArrayList<>();
        personTask6List.add(new PersonTask6("Oleg", Arrays.asList("Java","DataBase"),24));
        personTask6List.add(new PersonTask6("James", Arrays.asList("Java","Python"),22));
        personTask6List.add(new PersonTask6("James", Arrays.asList("Java","Marketing"),23));
        personTask6List.add(new PersonTask6("James", Arrays.asList("Java","UnrealEngine"),27));
        personTask6List.add(new PersonTask6("James", Arrays.asList("Java","Unity"),30));
        personTask6List.add(new PersonTask6("James", Arrays.asList("Java","3D"),38));

        List<String> uniqueSkills = personTask6List.stream().filter(p -> p.getAge() > 25).flatMap(p -> p.getSkills().stream()).filter(s -> !s.equalsIgnoreCase("Java")) .distinct().collect(Collectors.toList());

        System.out.println("Unique Skills : " + uniqueSkills);
    }
}
