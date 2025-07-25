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
        departments.put(department.getId(), department);
    }

    public Department findByName(String name) {
        return departments.get(name);
    }

    public boolean exists(String id) {
        return departments.containsKey(id);
    }

    public List<Department> findAll() {
        return new ArrayList<>(departments.values());
    }

    public void deleteDepartment(String name) {
        departments.remove(name);
    }
}
