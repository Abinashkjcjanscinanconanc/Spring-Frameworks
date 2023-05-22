package org.jt.imagedocumentationretrive.repository;

import org.jt.imagedocumentationretrive.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, String> {
    
}
