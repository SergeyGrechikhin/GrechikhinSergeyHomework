package holidayWork.miniProject.thirdProject.entity;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private String companyName;
    private List<Department> departments;

    public Company(String companyName) {
        this.departments = new ArrayList<>();
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    @Override
    public String toString() {
        return " Company : " + companyName +
                "\n Departments : " + (departments.isEmpty() ? "none" : departments.stream().map(Department ::getDepartmentName).toList());
    }
}
