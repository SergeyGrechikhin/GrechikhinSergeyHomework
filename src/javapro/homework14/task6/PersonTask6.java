package javapro.homework14.task6;

import java.util.List;

public class PersonTask6 {
    private String name;
    private int age;
    private List<String> skills;

    public PersonTask6(String name, List<String> skills, int age) {
        this.name = name;
        this.skills = skills;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public List<String> getSkills() {
        return skills;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "PersonTask6{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", skills=" + skills +
                '}';
    }
}
