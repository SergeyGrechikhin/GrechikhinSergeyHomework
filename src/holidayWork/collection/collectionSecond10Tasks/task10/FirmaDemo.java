package holidayWork.collection.collectionSecond10Tasks.task10;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class FirmaDemo {
    public static void main(String[] args) {
        TreeMap<Department, List<Employee>> map1 = new TreeMap<>();
        map1.put(new Department("Managers"),List.of(new Employee("Oleg",2000),new Employee("Harry",3000),new Employee("Max",2500)));

        TreeMap<Department, List<Employee>> map2 = new TreeMap<>();
        map2.put(new Department("Marketing"),List.of(new Employee("Stas",4000),new Employee("Harry",6000),new Employee("Max",5000)));


        for (Map.Entry<Department, List<Employee>> entry : map1.entrySet()) {
            String name = entry.getKey().getName();
            List<Employee> employees = entry.getValue();

            int totalSalary = 0 ;
            for (Employee employee : employees) {
                totalSalary += employee.getSalary() / employees.size();
            }
            System.out.println(name);
            System.out.println(totalSalary);
        }

        for (Map.Entry<Department, List<Employee>> entry : map2.entrySet()) {
            String name = entry.getKey().getName();
            List<Employee> employees = entry.getValue();

            int totalSalary = 0 ;
            for (Employee employee : employees) {
                totalSalary += employee.getSalary() / employees.size();
            }
            System.out.println(name);
            System.out.println(totalSalary);
        }
    }
}
