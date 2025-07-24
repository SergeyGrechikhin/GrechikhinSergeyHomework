package holidayWork.miniProject.thirdProject.service;


import holidayWork.miniProject.firstProject.entity.Student;
import holidayWork.miniProject.secondProject.dto.ResponceCarDTO;
import holidayWork.miniProject.secondProject.entity.Car;
import holidayWork.miniProject.thirdProject.dto.ResponceCompanyDTO;
import holidayWork.miniProject.thirdProject.entity.Employee;
import holidayWork.miniProject.thirdProject.repository.EmployeeRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeService {
   EmployeeRepository employeeRepository = new EmployeeRepository();

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public ResponceCompanyDTO<Employee> create(String firstName, String lastName, String id) {
        if (employeeRepository.existsById(id)) {
            return ResponceCompanyDTO.requestFalse(null,"Employee with this id already exists");
        }
        Employee employee = new Employee(firstName, id, lastName);
        employeeRepository.save(employee);
        return ResponceCompanyDTO.requestTrue(employee,"Employee successfully created");
    }

    public List<Employee> findAll() {
        return new ArrayList<>(employeeRepository.findAll());
    }

    public ResponceCompanyDTO findByFirstName(String firstName){
        List<Employee> list = employeeRepository.findAll().stream().filter(c -> c.getFirstName().equalsIgnoreCase(firstName)).collect(Collectors.toList());
        if(list.isEmpty()){
            return  ResponceCompanyDTO.requestFalse(null,"Employees not found") ;
        }
        return ResponceCompanyDTO.requestTrue(list,"Employee successfully found");
    }

    public ResponceCompanyDTO findByLastName(String lastName){
        List<Employee> list = employeeRepository.findAll().stream().filter(c -> c.getLastName().equalsIgnoreCase(lastName)).collect(Collectors.toList());
        if(list.isEmpty()){
            return ResponceCompanyDTO.requestFalse(null,"Employees not found") ;
        }
        return  ResponceCompanyDTO.requestTrue(list,"Employee successfully found");
    }

    public ResponceCompanyDTO deleteById(String id){
        if (!employeeRepository.existsById(id)) {
            return ResponceCompanyDTO.requestFalse(null,"Employee with this id does not exist");
        }
        employeeRepository.deleteEmployee(id);
        return  ResponceCompanyDTO.requestTrue(id,"Employee successfully deleted");
    }
}
