package javapro.homework15.task2;

public class PersonTask2 {
    private int age;

    public PersonTask2(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "PersonTask2{" +
                "age=" + age +
                '}';
    }
}
