package org.jt.mongoconnection.repository;

import org.jt.mongoconnection.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, String> {

}
