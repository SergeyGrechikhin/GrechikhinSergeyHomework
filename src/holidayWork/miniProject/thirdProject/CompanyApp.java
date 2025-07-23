package holidayWork.miniProject.thirdProject;

import holidayWork.miniProject.thirdProject.repository.CompanyRepository;
import holidayWork.miniProject.thirdProject.repository.DepartmentRepository;
import holidayWork.miniProject.thirdProject.repository.EmployeeRepository;
import holidayWork.miniProject.thirdProject.service.CompanyService;
import holidayWork.miniProject.thirdProject.service.DepartmentService;
import holidayWork.miniProject.thirdProject.service.EmployeeService;
import holidayWork.miniProject.thirdProject.ui.UiCompany;

public class CompanyApp {
    public static void main(String[] args) {
        CompanyRepository cr = new CompanyRepository();
        DepartmentRepository dr = new DepartmentRepository();
        EmployeeRepository edr = new EmployeeRepository();

        EmployeeService employeeService = new EmployeeService(edr);
        DepartmentService ds = new DepartmentService(dr,edr);
        CompanyService cs = new CompanyService(cr,edr,dr);

        UiCompany ui = new UiCompany(cs,ds,employeeService);
        ui.menu();
    }


}
