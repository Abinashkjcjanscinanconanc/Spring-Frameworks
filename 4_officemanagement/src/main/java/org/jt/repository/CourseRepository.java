package org.jt.repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.jt.config.DbConfig;
import org.jt.model.Course;

public class CourseRepository {
    private static final String COURSE_TABLE = "courses";
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
                SELECT * FROM %s
                        """.formatted(COURSE_TABLE);

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

        return new Course(courseId, courseName);
    }
}

