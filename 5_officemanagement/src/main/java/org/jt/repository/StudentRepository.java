package org.jt.repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.jt.config.DbConfig;
import org.jt.model.Course;
import org.jt.model.Student;

public class StudentRepository {
    private static final String STUDENT_TABLE = "students";
    private static final String COURSE_STUDENT_TABLE = "courses_students";
    private static final String COURSE_TABLE = "courses";
    private final Connection connection;
    private List<Student> students;

    public StudentRepository() {

        connection = DbConfig.getConnection();
    }

    public void addStudent(Student student) {

        var QUERY = """
                INSERT INTO %s (name, roll, fee) VALUES (?, ?, ?)
                """.formatted(STUDENT_TABLE);

        try {
            var prepareStatement = connection.prepareStatement(QUERY);
            prepareStatement.setString(1, student.getName());
            prepareStatement.setInt(2, student.getRoll());
            prepareStatement.setDouble(3, student.getFee());

            prepareStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Student> getStudents() {
        students = new ArrayList<>();
        var QUERY = """
                SELECT * FROM %s s INNER JOIN %s cs
                ON s.roll = cs.student_id
                INNER JOIN %s c 
                ON c.course_id = cs.course_id
                        """.formatted(STUDENT_TABLE, COURSE_STUDENT_TABLE, COURSE_TABLE);

        try {
            var prepareStatement = connection.prepareStatement(QUERY);

            var resultSet = prepareStatement.executeQuery();
            while (resultSet.next()) {
                addStudent(resultSet);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return students;
    }

    private void addStudent(ResultSet resultSet) throws Exception {
        var roll = resultSet.getInt("roll");
        Student student = existsByRoll(roll);

        var courseId = resultSet.getInt("course_id");
        var courseName = resultSet.getString("course_name");
        Course course = Course.builder().courseId(courseId).courseName(courseName).build();

        if (student != null) {
            student.getCourses().add(course);
        } else {
            var name = resultSet.getString("name");
            var fee = resultSet.getDouble("fee");

            var courses = new ArrayList<Course>();
            courses.add(course);

            student = Student.builder().name(name).roll(roll).fee(fee).courses(courses).build();
            students.add(student);
        }

    }

    private Student existsByRoll(int roll) {
        return students.stream().filter(student -> student.getRoll() == roll).findFirst().orElse(null);
    }
}
