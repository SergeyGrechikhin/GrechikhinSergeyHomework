package holidayWork.miniProject.thirdProject.service;

import holidayWork.miniProject.thirdProject.dto.ResponceCompanyDTO;
import holidayWork.miniProject.thirdProject.entity.Company;
import holidayWork.miniProject.thirdProject.entity.Department;
import holidayWork.miniProject.thirdProject.entity.Employee;
import holidayWork.miniProject.thirdProject.repository.CompanyRepository;
import holidayWork.miniProject.thirdProject.repository.DepartmentRepository;
import holidayWork.miniProject.thirdProject.repository.EmployeeRepository;

import java.util.List;

public class CompanyService {
 private final   CompanyRepository companyRepository ;
  private final  DepartmentRepository departmentRepository;
   private final EmployeeRepository employeeRepository ;


    public CompanyService(CompanyRepository companyRepository, EmployeeRepository employeeRepository, DepartmentRepository departmentRepository) {
        this.companyRepository = companyRepository;
        this.employeeRepository = employeeRepository;
        this.departmentRepository = departmentRepository;
    }

    public ResponceCompanyDTO<Company> createCompany(String name) {
        if (companyRepository.exists(name)) {
            return ResponceCompanyDTO.requestFalse(null,"Company already exists") ;
        }
        Company company = new Company(name);
        companyRepository.save(company);
        return ResponceCompanyDTO.requestTrue(null,"Company created successfully");
    }

    public ResponceCompanyDTO<?> addDepartmentToCompany(String departmentName, String companyName) {
        Department department = departmentRepository.findByName(departmentName);
        if (department == null) {
            return ResponceCompanyDTO.requestFalse(null,"Department not found") ;
        }
        Company company = companyRepository.findByName(companyName);
        if (company == null) {
            return ResponceCompanyDTO.requestFalse(null,"Company not found");
        }
        company.addDepartment(department);
        return  ResponceCompanyDTO.requestTrue(null,"Department added successfully");
    }
    public List<Company> getAllCompany() {
        return companyRepository.findAll();
    }

    public ResponceCompanyDTO deleteCompany(String name) {
        if (!companyRepository.exists(name)) {
            return ResponceCompanyDTO.requestFalse(null,"Company not found");
        }
        companyRepository.deleteCompany(name);
        return ResponceCompanyDTO.requestTrue(null,"Department deleted successfully");
    }
}
