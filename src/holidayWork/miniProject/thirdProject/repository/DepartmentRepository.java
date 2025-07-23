package holidayWork.miniProject.thirdProject.repository;

import holidayWork.miniProject.firstProject.entity.Gruppe;
import holidayWork.miniProject.thirdProject.entity.Department;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DepartmentRepository {

    private final Map<String, Department> departments = new HashMap<String, Department>();

    public void save(Department department) {
        departments.put(department.getDepartmentName(), department);
    }

    public Department findByName(String name) {
        return departments.get(name);
    }

    public boolean exists(String name) {
        return departments.containsKey(name);
    }

    public List<Department> findAll() {
        return new ArrayList<>(departments.values());
    }
}
