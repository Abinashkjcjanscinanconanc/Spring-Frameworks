package org.jt.service;

import java.util.List;

import org.jt.model.Employee;
import org.jt.repository.EmployeeRepository;

public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeService() {

        employeeRepository = new EmployeeRepository();
    }

    public void addEmployee(Employee employee) {
        employeeRepository.addEmployee(employee);
    }

    public List<Employee> employees() {
        return employeeRepository.getEmployees();
    }
}

