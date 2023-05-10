package org.jt.service;

import java.util.List;
import org.jt.model.Course;
import org.jt.repository.CourseRepository;

public class CourseService {
    private final CourseRepository courseRepository;

    public CourseService() {

        courseRepository = new CourseRepository();
    }

    public void addCourse(Course Course) {
       courseRepository.addCourse(Course);
    }

    public List<Course> courses() {
        return courseRepository.getCourses();
    }
}

