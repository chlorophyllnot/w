import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeManager {
    private List<Employee> employees;

    public EmployeeManager() {
        employees = new ArrayList<>();
    }

    public void addEmployee(String name, int age) {
        Employee employee = new Employee(name, age);
        employees.add(employee);
    }

    public void deleteEmployee(String name) {
        employees.removeIf(employee -> employee.getName().equals(name));
    }

    public void printEmployees() {
        Collections.sort(employees, (e1, e2) -> e1.getName().compareTo(e2.getName()));
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}