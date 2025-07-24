package holidayWork.miniProject.thirdProject.repository;

import holidayWork.miniProject.firstProject.entity.Student;
import holidayWork.miniProject.thirdProject.entity.Employee;

import java.util.*;

public class EmployeeRepository {
    private final Map<String, Employee> employees = new HashMap<>();

    public void save(Employee employee) {
        employees.put(employee.getId(),  employee);
    }

    public Employee findById(String id) {
        return employees.get(id);
    }


    public boolean existsById(String id) {
        return employees.containsKey(id);
    }

    public Collection<Employee> findAll() {
        return employees.values();
    }

    public void deleteEmployee(String id) {
        employees.remove(id);
    }


}
