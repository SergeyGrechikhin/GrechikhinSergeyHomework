package holidayWork.miniProject.thirdProject.ui;

import holidayWork.miniProject.firstProject.entity.Gruppe;
import holidayWork.miniProject.firstProject.entity.Student;
import holidayWork.miniProject.thirdProject.dto.ResponceCompanyDTO;
import holidayWork.miniProject.thirdProject.entity.Company;
import holidayWork.miniProject.thirdProject.entity.Department;
import holidayWork.miniProject.thirdProject.entity.Employee;
import holidayWork.miniProject.thirdProject.service.CompanyService;
import holidayWork.miniProject.thirdProject.service.DepartmentService;
import holidayWork.miniProject.thirdProject.service.EmployeeService;

import java.util.List;
import java.util.Scanner;

public class UiCompany {

    private final  CompanyService companyService ;
    private final DepartmentService departmentService ;
    private final EmployeeService employeeService ;
    private final Scanner scanner = new Scanner(System.in);

    public UiCompany(CompanyService companyService, DepartmentService departmentService, EmployeeService employeeService) {
        this.companyService = companyService;
        this.departmentService = departmentService;
        this.employeeService = employeeService;
    }

    private void createEmployee (){
        System.out.println("Enter your first name:");
        String name = scanner.nextLine();
        System.out.println("Enter your last name:");
        String lastName = scanner.nextLine();
        System.out.println("Enter your id :");
        String id = scanner.nextLine();
        ResponceCompanyDTO<?> responce = employeeService.create(name,lastName,id);
        System.out.println(responce.getMessage());
    }

    private void createDepartment (){
        System.out.println("Enter your Department name:");
        String name = scanner.nextLine();
        ResponceCompanyDTO<?> responce = departmentService.createDepartment(name);
    }

    private void createCompany (){
        System.out.println("Enter your Company name:");
        String name = scanner.nextLine();
        ResponceCompanyDTO<?> responce = companyService.createCompany(name);
    }

    private void employeeToDepartment (){
        System.out.println("Enter your  Employee id :");
        String id = scanner.nextLine();
        System.out.println("Enter your  Department name :");
        String name = scanner.nextLine();
        ResponceCompanyDTO<?> responce = departmentService.addEmployeeToDepartment(id,name);
        System.out.println(responce.getMessage());
    }

    private void departmentToCompany (){
        System.out.println("Enter your Department Name : ");
        String name = scanner.nextLine();
        System.out.println("Enter your Company Name : ");
        String companyName = scanner.nextLine();
        ResponceCompanyDTO<?> responce = companyService.addDepartmentToCompany(name,companyName);
    }

    private void showEmployee () {
        List<Employee> employees = employeeService.findAll();
        if (employees.isEmpty()) {
            System.out.println("Employee list is empty");
            return;
        }
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    private void showDepartment() {
        List<Department> departments = departmentService.getAllDepartments();
        if (departments.isEmpty()) {
            System.out.println("Department list is empty");
            return;
        }
        for (Department department : departments) {
            System.out.println(department);
            for (Employee employee : department.getEmployees()) {
                System.out.println(employee);
            }
        }
    }

    private void showCompany() {
        List<Company> company = companyService.getAllCompany();
        if (company.isEmpty()) {
            System.out.println("Company list is empty");
            return;
        }
        for (Company companys : company) {
            System.out.println(companys);
            for (Department departments : companys.getDepartments()) {
                System.out.println(departments);
                for (Employee employee : departments.getEmployees()) {
                    System.out.println(employee);
                }

            }
        }
    }

    public void menu(){
        while (true) {
            System.out.println("Menu");
            System.out.println("1.Add Employee");
            System.out.println("2.Add Department");
            System.out.println("3.Add Company");
            System.out.println("4.Find All Company");
            System.out.println("5.Find All Departments");
            System.out.println("6.Find All Employees");
            System.out.println("7.Transfer of employee to department");
            System.out.println("8.Transfer of department to company");
            System.out.println("0.Выход");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1" -> createEmployee();
                case "2" -> createDepartment();
                case "3" -> createCompany();
                case "4" -> showCompany();
                case "5" -> showDepartment();
                case "6" -> showEmployee();
                case "7" -> employeeToDepartment();
                case "8" -> departmentToCompany();
                case "0" ->{
                    System.out.println("Exit");
                    return;
                }
                default -> System.out.println("Invalid choice");

            }

        }
    }


}
