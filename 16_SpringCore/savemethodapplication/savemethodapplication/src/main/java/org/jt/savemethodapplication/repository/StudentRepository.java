package org.jt.savemethodapplication.repository;

import org.jt.savemethodapplication.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer>{
    

}
