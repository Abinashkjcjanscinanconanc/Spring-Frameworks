package org.jt.manytoonerelation.repository;

import org.jt.manytoonerelation.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Integer> {

}
