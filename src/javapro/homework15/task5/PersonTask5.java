package javapro.homework15.task5;

public class PersonTask5 {
    private int age ;

    public PersonTask5(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }
}
