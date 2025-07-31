package javapro.homework14.task8;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class PersonDemoTask8 {
    public static void main(String[] args) {
        List<PersonTask8> personList = new ArrayList<>();
        personList.add(new PersonTask8("Andrey",10000,35));
        personList.add(new PersonTask8("Jack",2500,20));
        personList.add(new PersonTask8("James",2500,21));
        personList.add(new PersonTask8("John",2500,25));
        personList.add(new PersonTask8("Andy",2500,30));
        personList.add(new PersonTask8("James",2500,41));

        List<PersonTask8> personAgeList = personList.stream().filter(p -> p.getAge() >= 25 ).filter(p -> p.getAge() < 40).collect(Collectors.toList());

        OptionalDouble personAverageSalary = personAgeList.stream().mapToDouble(PersonTask8::getSalary).average();

        System.out.println("Person Average Salary : " + personAverageSalary);



    }
}
