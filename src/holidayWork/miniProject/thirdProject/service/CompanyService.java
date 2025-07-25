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

  private final DepartmentService departmentService;



    public CompanyService(CompanyRepository companyRepository, DepartmentService departmentService) {
        this.companyRepository = companyRepository;

        this.departmentService = departmentService;

    }

    public Company findbyNameforTransfer(String nameCompany){
        return companyRepository.findAll().stream().filter(company -> company.getCompanyName().equalsIgnoreCase(nameCompany)).findFirst().orElse(null);
    }

    public ResponceCompanyDTO<Company> createCompany(String name) {
        if (companyRepository.exists(name)) {
            return ResponceCompanyDTO.requestFalse(null,"Company already exists") ;
        }
        Company company = new Company(name);
        companyRepository.save(company);
        return ResponceCompanyDTO.requestTrue(null,"Company created successfully");
    }

    public ResponceCompanyDTO<?> addDepartmentToCompany(String id, String companyName) {
        Department department = departmentService.findById(id);
        if (department == null) {
            return ResponceCompanyDTO.requestFalse(null,"Department not found") ;
        }
        Company company = findbyNameforTransfer(companyName);
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

    public ResponceCompanyDTO<?> transferDepartmentToOtherCompany(String id,String companyName) {
        Department department = departmentService.findById(id);
        if (department == null) {
            return ResponceCompanyDTO.requestFalse(null,"Department not found");
        }
        Company newCompany = findbyNameforTransfer(companyName);
        if (newCompany == null) {
            return ResponceCompanyDTO.requestFalse(null,"Company not found");
        }
        Company oldCompany = companyRepository.findAll().stream().filter(company -> company.getDepartments().contains(department)).findFirst().orElse(null);

        if (oldCompany != null) {
            oldCompany.getDepartments().remove(department);
        }
        newCompany.addDepartment(department);

        return ResponceCompanyDTO.requestTrue(null,"Department transferred successfully");
    }
}
