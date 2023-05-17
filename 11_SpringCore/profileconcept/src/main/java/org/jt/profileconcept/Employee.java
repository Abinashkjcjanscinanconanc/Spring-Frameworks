package org.jt.profileconcept;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
    @Value("${name}")
    private String name;

    @Override
    public String toString() {
        return "Employee [name=" + name + "]";
    }
}
