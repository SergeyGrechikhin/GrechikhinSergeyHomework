package holidayWork.miniProject.thirdProject.entity;

public class Employee {
    private String firstName;
    private String lastName;
    private String id;

    public Employee(String firstName, String id, String lastName) {
        this.firstName = firstName;
        this.id = id;
        this.lastName = lastName;
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

    @Override
    public String toString() {
        return "Employee : " + firstName + " " + lastName + " ID " + id ;
    }
}
