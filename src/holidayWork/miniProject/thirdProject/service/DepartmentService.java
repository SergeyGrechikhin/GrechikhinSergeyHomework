package holidayWork.miniProject.thirdProject.service;


import holidayWork.miniProject.firstProject.entity.Gruppe;
import holidayWork.miniProject.firstProject.entity.Student;
import holidayWork.miniProject.firstProject.repository.GruppeRepository;
import holidayWork.miniProject.firstProject.repository.StudentRepository;
import holidayWork.miniProject.thirdProject.dto.ResponceCompanyDTO;
import holidayWork.miniProject.thirdProject.entity.Company;
import holidayWork.miniProject.thirdProject.entity.Department;
import holidayWork.miniProject.thirdProject.entity.Employee;
import holidayWork.miniProject.thirdProject.repository.DepartmentRepository;
import holidayWork.miniProject.thirdProject.repository.EmployeeRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DepartmentService {
    private final DepartmentRepository departmentRepository;
    private final EmployeeRepository employeeRepository;

    public DepartmentService(DepartmentRepository departmentRepository, EmployeeRepository employeeRepository) {
        this.departmentRepository = departmentRepository;
        this.employeeRepository = employeeRepository;
    }

    public ResponceCompanyDTO<Department> createDepartment(String name,String id) {
        if (departmentRepository.exists(id)) {
            return ResponceCompanyDTO.requestFalse(null,"Department with this id already exists") ;
        }
        Department department = new Department(name,id);
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
        return new ArrayList<>(departmentRepository.findAll());
    }


    public ResponceCompanyDTO deleteDepartment(String name) {
        if (!departmentRepository.exists(name)) {
            return ResponceCompanyDTO.requestFalse(null,"Department not found");
        }
        departmentRepository.deleteDepartment(name);
        return ResponceCompanyDTO.requestTrue(null,"Department deleted successfully");
    }

    public ResponceCompanyDTO<?> transferEmployeeToOtherDepartment(String employeeId,String departmentName) {
        Employee employee = employeeRepository.findById(employeeId);
        if (employee == null) {
            return ResponceCompanyDTO.requestFalse(null,"Employee not found");
        }
        Department newDepartment = departmentRepository.findByName(departmentName);
        if (newDepartment == null) {
            return ResponceCompanyDTO.requestFalse(null,"Department not found");
        }
        Department oldDepartment = departmentRepository.findAll().stream().filter(department -> department.getEmployees().contains(employee)).findFirst().orElse(null);

        if (oldDepartment != null) {
            oldDepartment.getEmployees().remove(employee);
        }
        newDepartment.addEmployee(employee);
        return ResponceCompanyDTO.requestTrue(null,"Department transferred successfully");
    }

    public ResponceCompanyDTO findDepartmentByName(String name) {
       List<Department> departments = departmentRepository.findAll().stream().filter(department -> department.getDepartmentName().equalsIgnoreCase(name)).collect(Collectors.toList());
       if (departments.isEmpty()) {
           return ResponceCompanyDTO.requestFalse(null,"Department not found");
       }
       return ResponceCompanyDTO.requestTrue(departments,"Department found successfully");
    }


}
