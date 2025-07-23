package holidayWork.miniProject.thirdProject.repository;

import holidayWork.miniProject.thirdProject.entity.Company;
import holidayWork.miniProject.thirdProject.entity.Department;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CompanyRepository {

    private final Map<String, Company> companyss = new HashMap<String, Company>();

    public void save(Company company) {
        companyss.put(company.getCompanyName(), company);
    }

    public Company findByName(String name) {
        return companyss.get(name);
    }

    public boolean exists(String name) {
        return companyss.containsKey(name);
    }

    public List<Company> findAll() {
        return new ArrayList<>(companyss.values());
    }
}
