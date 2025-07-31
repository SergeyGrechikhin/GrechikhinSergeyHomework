package javapro.homework14.task4;

public class StudentTask4 {
    private String name;
    private int year;
    private  double avgGrade;

    public StudentTask4(String name, double avgGrade, int year) {
        this.name = name;
        this.avgGrade = avgGrade;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "StudentTask4{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", avgGrade=" + avgGrade +
                '}';
    }
}
