package holidayWork.miniProject.thirdProject.entity;

import holidayWork.miniProject.firstProject.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class Department {

    private String departmentName;
    private List<Employee> employees;
    private String id;

    public Department(String departmentName , String id) {
        this.departmentName = departmentName;
        this.employees = new ArrayList<>();
        this.id = id ;
    }

    public String getId() {
        return id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }


    @Override
    public String toString() {
        return "Department : " + departmentName +
                "\n Employees : " + (employees.isEmpty() ? "none" : employees.stream().map(Employee::getFullName).toList());
    }
}
