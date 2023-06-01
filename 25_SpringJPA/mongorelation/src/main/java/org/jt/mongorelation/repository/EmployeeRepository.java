package org.jt.mongorelation.repository;

import org.jt.mongorelation.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends MongoRepository<Employee, String> {

}
