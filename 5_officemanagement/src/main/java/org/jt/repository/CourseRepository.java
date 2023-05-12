package org.jt.repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.jt.config.DbConfig;
import org.jt.model.Course;
import org.jt.model.Employee;

public class CourseRepository {
    private static final String COURSE_TABLE = "courses";
    private static final String EMPLOYEE_TABLE = "employees";
    private final Connection connection;

    public CourseRepository() {
        connection = DbConfig.getConnection();
    }

    public void addCourse(Course course) {

        var QUERY = """
                INSERT INTO %s (course_id, course_name) VALUES (?, ?)
                """.formatted(COURSE_TABLE);

        try {
            var prepareStatement = connection.prepareStatement(QUERY);
            prepareStatement.setInt(1, course.getCourseId());
            prepareStatement.setString(2, course.getCourseName());

            prepareStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Course> getCourses() {
        List<Course> Courses = new ArrayList<>();
        var QUERY = """
                SELECT * FROM %s c INNER JOIN %s e
                ON c.employee_id = e.id
                        """.formatted(COURSE_TABLE, EMPLOYEE_TABLE);

        try {
            var prepareStatement = connection.prepareStatement(QUERY);

            var resultSet = prepareStatement.executeQuery();
            while (resultSet.next()) {
                Courses.add(getCourses(resultSet));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return Courses;
    }

    private Course getCourses(ResultSet resultSet) throws Exception {
        var courseId = resultSet.getInt("course_id");
        var courseName = resultSet.getString("course_name");
        var employeeId = resultSet.getInt("employee_id");
        var employeeName = resultSet.getString("name");
        var employeeSalary = resultSet.getDouble("salary");

        var employee = new Employee(employeeId, employeeName, employeeSalary);
        return new Course(courseId, courseName, employee);
    }
}

