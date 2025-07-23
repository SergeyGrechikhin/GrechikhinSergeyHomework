package holidayWork.miniProject.thirdProject.service;


import holidayWork.miniProject.firstProject.entity.Gruppe;
import holidayWork.miniProject.firstProject.entity.Student;
import holidayWork.miniProject.firstProject.repository.GruppeRepository;
import holidayWork.miniProject.firstProject.repository.StudentRepository;
import holidayWork.miniProject.thirdProject.dto.ResponceCompanyDTO;
import holidayWork.miniProject.thirdProject.entity.Department;
import holidayWork.miniProject.thirdProject.entity.Employee;
import holidayWork.miniProject.thirdProject.repository.DepartmentRepository;
import holidayWork.miniProject.thirdProject.repository.EmployeeRepository;

import java.util.List;

public class DepartmentService {
    private final DepartmentRepository departmentRepository;
    private final EmployeeRepository employeeRepository;

    public DepartmentService(DepartmentRepository departmentRepository, EmployeeRepository employeeRepository) {
        this.departmentRepository = departmentRepository;
        this.employeeRepository = employeeRepository;
    }

    public ResponceCompanyDTO<Department> createDepartment(String name) {
        if (departmentRepository.exists(name)) {
            return ResponceCompanyDTO.requestFalse(null,"Department already exists") ;
        }
        Department department = new Department(name);
        departmentRepository.save(department);
        return ResponceCompanyDTO.requestTrue(null,"Department created successfully");
    }

    public ResponceCompanyDTO<?> addEmployeeToDepartment(String studentId, String departmentName) {
        Employee employee = employeeRepository.findById(studentId);
        if (employee == null) {
            return ResponceCompanyDTO.requestFalse(null,"Employee not found") ;
        }
        Department department = departmentRepository.findByName(departmentName);
        if (department == null) {
            return ResponceCompanyDTO.requestFalse(null,"Department not found");
        }
        department.addEmployee(employee);
        return  ResponceCompanyDTO.requestTrue(null,"Employee added successfully");
    }
    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }
}
