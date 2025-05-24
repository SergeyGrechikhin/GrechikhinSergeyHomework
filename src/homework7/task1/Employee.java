package homework7.task1;

public class Employee {
    private String name ;
    private int hoursworked ;
    private double hourlyRate ;
    private double  monthlySalary ;

    public Employee(String name, int hoursworked, double hourlyRate, double monthlySalary) {
        this.name = name;
        this.hoursworked = hoursworked;
        this.hourlyRate = hourlyRate;
        this.monthlySalary = monthlySalary;
    }

    public String setName() {
        return name;
    }

    public void setHoursworked(int hoursworked) {
        this.hoursworked = hoursworked;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public void getMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", hoursworked=" + hoursworked +
                ", hourlyRate=" + hourlyRate +
                ", monthlySalary=" + monthlySalary +
                '}';
    }
}
