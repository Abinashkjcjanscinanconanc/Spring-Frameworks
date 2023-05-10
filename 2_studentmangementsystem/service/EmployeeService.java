package service;

import java.util.List;

import model.Employee;
import repository.EmployeeRepository;

public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeService() {
        employeeRepository = new EmployeeRepository();
    }

    public void addEmployee(Employee employee) {
        employeeRepository.addemployee(employee);
    }

    public List<Employee> employees() {
        return employeeRepository.getemployees();
    }
}
