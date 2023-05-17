package org.jt.externalproperty;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
    @Value("${employee.name}")
    private String name;
    @Value("${employee.id}")
    private String id;
    @Value("${employee.salary}")
    private double salary;

    @Override
    public String toString() {
        return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + "]";
    }
}
