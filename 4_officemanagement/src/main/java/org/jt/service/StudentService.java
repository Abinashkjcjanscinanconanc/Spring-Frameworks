package org.jt.service;

import java.util.List;

import org.jt.model.Student;
import org.jt.repository.StudentRepository;

public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService() {
        studentRepository = new StudentRepository();
    }

    public void addStudent(Student student) {
        studentRepository.addStudent(student);
    }

    public List<Student> students() {
        return studentRepository.getStudents();
    }
}
