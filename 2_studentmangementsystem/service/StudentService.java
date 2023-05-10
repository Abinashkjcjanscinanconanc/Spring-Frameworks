package service;

import java.util.List;

import model.Student;
import repository.StudentRepository;

public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService() {
        studentRepository = new StudentRepository();
    }

    /**
     * <h1>Add a name</h1>
     * Using this method you can add a name
     * 
     * @param name -> string
     */
    public void addStudent(Student student) {
        studentRepository.addStudent(student);
    }

    public List<Student> students() {
        return studentRepository.getStudents();
    }
}
