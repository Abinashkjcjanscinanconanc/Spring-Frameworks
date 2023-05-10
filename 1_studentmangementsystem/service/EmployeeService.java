package service;

import java.util.ArrayList;
import java.util.List;

import model.Employee;

public class EmployeeService {
    private List<Employee> employees;

    public EmployeeService() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public List<Employee> employees() {
        return employees;
    }
}
