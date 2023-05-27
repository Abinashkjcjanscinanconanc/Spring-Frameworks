package org.jt.manytoonerelation.repository;

import org.jt.manytoonerelation.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Integer> {

}
