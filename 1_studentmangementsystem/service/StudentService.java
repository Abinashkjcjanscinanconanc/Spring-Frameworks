package service;

import java.util.ArrayList;
import java.util.List;

import model.Student;

public class StudentService {
    private List<Student> students;

    public StudentService() {
        students = new ArrayList<>();
    }

    /**
     * <h1>Add a name</h1>
     * Using this method you can add a name
     * 
     * @param name -> string
     */
    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> students() {
        return students;
    }
}
