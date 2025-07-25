package holidayWork.miniProject.thirdProject.entity;

public class Employee {
    private String firstName;
    private String lastName;
    private String id;
    private String position;

    public Employee(String firstName, String position, String id, String lastName) {
        this.firstName = firstName;
        this.position = position;
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

    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "Employee : " + firstName + " " + lastName + " ID : " + id + " Position : " + position;
    }
}
