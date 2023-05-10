package repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import config.DbConfig;
import model.Student;

public class StudentRepository {
    private static final String STUDENT_TABLE = "students";
    private final Connection connection;

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
        List<Student> students = new ArrayList<>();
        var QUERY = """
                SELECT * FROM %s
                        """.formatted(STUDENT_TABLE);

        try {
            var prepareStatement = connection.prepareStatement(QUERY);

            var resultSet = prepareStatement.executeQuery();
            while (resultSet.next()) {
                students.add(getStudent(resultSet));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return students;
    }

    private Student getStudent(ResultSet resultSet) throws Exception {
        var name = resultSet.getString("name");
        var roll = resultSet.getInt("roll");
        var fee = resultSet.getDouble("fee");

        return new Student(name, roll, fee);
    }
}
