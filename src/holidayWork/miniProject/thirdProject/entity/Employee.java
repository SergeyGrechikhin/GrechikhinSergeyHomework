package holidayWork.miniProject.thirdProject.entity;

public class Employee {
    private String firstName;
    private String lastName;
    private String id;
    private String position;
    private double salary;



    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(String firstName, String position, String id, String lastName, double salary) {
        this.firstName = firstName;
        this.position = position;
        this.id = id;
        this.lastName = lastName;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getId() {
        return id;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "Employee : " + firstName + " " + lastName + " ID : " + id + " Position : " + position;
    }
}
