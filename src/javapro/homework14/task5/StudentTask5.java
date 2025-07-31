package javapro.homework14.task5;

public class StudentTask5 {
    private String name ;
    private int year;
    private String info;

    public StudentTask5(String name, String info, int year) {
        this.name = name;
        this.info = info;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getInfo() {
        return info;
    }

    @Override
    public String toString() {
        return "StudentTask5{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", info='" + info + '\'' +
                '}';
    }
}
