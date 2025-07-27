package holidayWork.miniProject.thirdProject.ui;

import holidayWork.miniProject.firstProject.entity.Gruppe;
import holidayWork.miniProject.firstProject.entity.Student;
import holidayWork.miniProject.secondProject.dto.ResponceCarDTO;
import holidayWork.miniProject.thirdProject.dto.ResponceCompanyDTO;
import holidayWork.miniProject.thirdProject.entity.Company;
import holidayWork.miniProject.thirdProject.entity.Department;
import holidayWork.miniProject.thirdProject.entity.Employee;
import holidayWork.miniProject.thirdProject.service.CompanyService;
import holidayWork.miniProject.thirdProject.service.DepartmentService;
import holidayWork.miniProject.thirdProject.service.EmployeeService;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

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
        System.out.println("Enter status for employee : ");
        String status = scanner.nextLine();
        double salary = readDouble("Enter salary for employee : ");
        ResponceCompanyDTO<?> responce = employeeService.create(name, lastName, id, status,salary);
        System.out.println(responce.getMessage());
    }

    private void createDepartment (){
        System.out.println("Enter your Department name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your Department id: ");
        String id = scanner.nextLine();
        ResponceCompanyDTO<?> responce = departmentService.createDepartment(name,id);
        System.out.println(responce.getMessage());
    }

    private void createCompany (){
        System.out.println("Enter your Company name:");
        String name = scanner.nextLine();
        ResponceCompanyDTO<?> responce = companyService.createCompany(name);
        System.out.println(responce.getMessage());
    }

    private void employeeToDepartment (){
        System.out.println("Enter your  Employee id :");
        String empId = scanner.nextLine();
        System.out.println("Enter your  Department id :");
        String depId = scanner.nextLine();
        ResponceCompanyDTO<?> responce = departmentService.addEmployeeToDepartment(empId,depId);
        System.out.println(responce.getMessage());
    }

    private void departmentToCompany (){
        System.out.println("Enter your Department id : ");
        String depId = scanner.nextLine();
        System.out.println("Enter your Company Name : ");
        String companyName = scanner.nextLine();
        ResponceCompanyDTO<?> responce = companyService.addDepartmentToCompany(depId,companyName);
        System.out.println(responce.getMessage());
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


    private void deleteEmployee () {
        System.out.println("Enter Employee id for delete :");
        String id = scanner.nextLine();
        ResponceCompanyDTO responce = employeeService.deleteById(id);
        System.out.println(responce.getMessage());
    }

    private void deleteDepartment () {
        System.out.println("Enter Department id for delete : ");
        String id = scanner.nextLine();
        ResponceCompanyDTO responce = departmentService.deleteDepartment(id);
        System.out.println(responce.getMessage());
    }

    private void deleteCompany() {
        System.out.println("Enter Company name for delete : ");
        String name = scanner.nextLine();
        ResponceCompanyDTO responce = companyService.deleteCompany(name);
        System.out.println(responce.getMessage());
    }

    private void transferDepartmentForNewCompany(){
        System.out.println("Enter Department id for new company : ");
        String depName = scanner.nextLine();
        System.out.println("Enter new company name : ");
        String companyName = scanner.nextLine();
        ResponceCompanyDTO responce = companyService.transferDepartmentToOtherCompany(depName,companyName);
        System.out.println(responce.getMessage());
    }

    private void transferEmployeeForNewDepartment(){
        System.out.println("Enter Employee id for new Department : ");
        String empId = scanner.nextLine();
        System.out.println("Enter new Department id : ");
        String depId = scanner.nextLine();
        ResponceCompanyDTO responce = departmentService.transferEmployeeToOtherDepartment(empId,depId);
        System.out.println(responce.getMessage());
    }

    private void searchEmployeeByFirstName (){
        System.out.println("Enter Employee first name : ");
        String firstName = scanner.nextLine();
        printInfoResponse(employeeService.findByFirstName(firstName));

    }

    private void searchEmployeeByLastName (){
        System.out.println("Enter Employee last name : ");
        String lastName = scanner.nextLine();
        printInfoResponse(employeeService.findByLastName(lastName));
    }

    private void searchEmployeeByPosition (){
        System.out.println("Enter Employee company name : ");
        String position = scanner.nextLine();
        printInfoResponse(employeeService.findByPosition(position));
    }

    private void searchDepartmentbyName(){
        System.out.println("Enter Department name : ");
        String name = scanner.nextLine();
        printInfoResponse(departmentService.findDepartmentByName(name));
    }

    private void updateFirstNameforEmployee(){
        System.out.println("Enter id Employee for first name update : ");
        String id = scanner.nextLine();
        System.out.println("Enter new Employee first name : ");
        String firstName = scanner.nextLine();
        ResponceCompanyDTO responce = employeeService.updateFirstNameByEmployee(id,firstName);
        System.out.println(responce.getMessage());

    }

    private void updateLastNameforEmployee(){
        System.out.println("Enter id Employee for last name update : ");
        String id = scanner.nextLine();
        System.out.println("Enter new Employee last name : ");
        String lastName = scanner.nextLine();
        ResponceCompanyDTO responce = employeeService.updateLastNameByEmployee(id,lastName);
        System.out.println(responce.getMessage());
    }

    private void updatePositionforEmployee(){
        System.out.println("Enter id Employee for position update : ");
        String id = scanner.nextLine();
        System.out.println("Enter new Employee position : ");
        String position = scanner.nextLine();
        ResponceCompanyDTO responce = employeeService.updatePositionByEmployee(id,position);
        System.out.println(responce.getMessage());
    }

    private void updateSalaryforEmployee(){
        System.out.println("Enter id Employee for salary update : ");
        String id = scanner.nextLine();
        double newSalary = readDouble("Enter new salary : ");
        ResponceCompanyDTO responce = employeeService.updateSalaryByEmployee(id,newSalary);
        System.out.println(responce.getMessage());
    }

    private void printInfoResponse(ResponceCompanyDTO responce){
        System.out.println(responce.getMessage());
        if (responce.getData() != null){
            System.out.println("Info");
            System.out.println(responce.getData());
        }
    }

    private void advancedUpdateMenuForEmployee(){
        System.out.println("===*Advanced Update*===");
        System.out.println("1.Update Employee first name");
        System.out.println("2.Update Employee last name");
        System.out.println("3.Update Employee position");
        System.out.println("4.Update Employee salary");
        System.out.println("5.Back to main menu");
        String choise = scanner.nextLine();
        switch (choise) {
            case "1" -> updateFirstNameforEmployee();
            case "2" -> updateLastNameforEmployee();
            case "3" -> updatePositionforEmployee();
            case "4" -> updateSalaryforEmployee();
            case "5" -> menu();
            default -> System.out.println("Wrong choise.");

        }

    }

    private void updateMenu(){
        while (true) {
            System.out.println("===*Update Menu*===");
            System.out.println("1.Employee update");
            System.out.println("2.Back to main menu");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1" -> advancedUpdateMenuForEmployee();
                case "2" -> menu();

                default -> System.out.println("Wrong choise.");
            }
        }
    }

    private void menuForAdvancedSearch(){
        while (true){
            System.out.println("===*Advanced  Search*===");
            System.out.println("1.Search Employee by first name");
            System.out.println("2.Search Employee by last name");
            System.out.println("3.Search Employee by position");
            System.out.println("4.Search Department by name");
            System.out.println("5.Back to main menu");
            String choice = scanner.nextLine();
            switch (choice){
                case "1" -> searchEmployeeByFirstName();
                case "2" -> searchEmployeeByLastName();
                case "3" -> searchEmployeeByPosition();
                case "4" -> searchDepartmentbyName();
                case "5" -> menu();
                default -> System.out.println("Invalid choice");
            }

        }
    }




    private void menuDeletePersonal(){
        while (true) {
            System.out.println("===*Delete*===");
            System.out.println("1.Delete Employee");
            System.out.println("2.Delete Department");
            System.out.println("3.Delete Company");
            System.out.println("4.Back to Main Menu");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1" -> deleteEmployee();
                case "2" -> deleteDepartment();
                case "3" -> deleteCompany();
                case "4" -> menu();
                default -> System.out.println("Wrong choice");
            }
        }
    }

    private void menuForSearch(){
        while (true) {
            System.out.println("===*Search*===");
            System.out.println("1.Search all Employee");
            System.out.println("2.Search all Department");
            System.out.println("3.Search all Company");
            System.out.println("4.Advanced  Search");
            System.out.println("5.Back to Main Menu");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1" -> showEmployee();
                case "2" -> showDepartment();
                case "3" -> showCompany();
                case "4" -> menuForAdvancedSearch();
                case "5" -> menu();
                default -> System.out.println("Wrong choice");
            }
        }
    }

    private void menuForCreate(){
        while (true) {
            System.out.println("===*Create*===");
            System.out.println("1.Create Employee");
            System.out.println("2.Create Department");
            System.out.println("3.Create Company");
            System.out.println("4.Back to Main Menu");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1" -> createEmployee();
                case "2" -> createDepartment();
                case "3" -> createCompany();
                case "4" -> menu();
                default -> System.out.println("Wrong choice");
            }
        }
    }

    private void menuForTransfer(){
        while (true) {
            System.out.println("===*Transfer*===");
            System.out.println("1.Transfer Employee to Department");
            System.out.println("2.Transfer Department to Company");
            System.out.println("3.Transfer Department to new Company");
            System.out.println("4.Transfer Employee to new Department");
            System.out.println("5.Back to Main Menu");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1" -> employeeToDepartment();
                case "2" -> departmentToCompany();
                case "3" -> transferDepartmentForNewCompany();
                case "4" -> transferEmployeeForNewDepartment();
                case "5" -> menu();
                default -> System.out.println("Wrong choice");
            }
        }
    }

    public void menu(){
        while (true) {
            System.out.println("===*Menu*===");
            System.out.println("1.Create Menu");
            System.out.println("2.Search Menu");
            System.out.println("3.Transfer Menu");
            System.out.println("4.Delete menu");
            System.out.println("5.Update Menu");
            System.out.println("0.Выход");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1" -> menuForCreate();
                case "2" -> menuForSearch();
                case "3" -> menuForTransfer();
                case "4" -> menuDeletePersonal();
                case "5" -> updateMenu();
                case "0" ->{
                    System.out.println("Exit");
                   System.exit(0);
                }
                default -> System.out.println("Invalid choice");

            }

        }
    }

    private int readInt(String prompt){
        while (true){
            System.out.println(prompt);
            String input = scanner.nextLine();
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e){
                System.out.println("Invalid input . Enter only integer");
            }
        }
    }

    private double readDouble(String prompt){
        while (true){
            System.out.println(prompt);
            String input = scanner.nextLine();
            try {
                return Double.parseDouble(input);
            } catch (NumberFormatException e){
                System.out.println("Invalid input . Enter only double");
            }
        }
    }


}
