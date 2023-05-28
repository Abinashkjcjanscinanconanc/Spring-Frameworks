package org.jt.manytomany;

import java.util.List;

import org.jt.manytomany.model.Course;
import org.jt.manytomany.model.Student;
import org.jt.manytomany.repository.CourseRepository;
import org.jt.manytomany.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.RequiredArgsConstructor;

@SpringBootApplication
@RequiredArgsConstructor
public class ManytomanyApplication implements CommandLineRunner {
	private final StudentRepository studentRepository;
	private final CourseRepository courseRepository;

	public static void main(String[] args) {
		SpringApplication.run(ManytomanyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var students = getstudents();
		var courses = getcourses();

		courseAddToStudent(courses, students);
		studentAddToCourse(courses, students);

		studentRepository.saveAll(students);
	}

	private List<Student> getstudents() {
		var student1 = Student.builder().roll(101).name("smruti").build();
		var student2 = Student.builder().roll(102).name("sai").build();
		var student3 = Student.builder().roll(103).name("rutu").build();
		var student4 = Student.builder().roll(104).name("dhoni").build();
		var student5 = Student.builder().roll(105).name("jadu").build();
		var student6 = Student.builder().roll(106).name("warni").build();

		return List.of(student1, student2, student3, student4, student5, student6);
	}

	private List<Course> getcourses() {
		var course1 = Course.builder().courseId(10001).courseName("C").build();
		var course2 = Course.builder().courseId(10002).courseName("C++").build();
		var course3 = Course.builder().courseId(10003).courseName("JAVA").build();

		return List.of(course1, course2, course3);
	}

	private void courseAddToStudent(List<Course> courses, List<Student> students) {
		students.get(0).setCourses(List.of(courses.get(0), courses.get(1)));
		students.get(1).setCourses(List.of(courses.get(1)));
		students.get(2).setCourses(List.of(courses.get(2), courses.get(0)));
		students.get(3).setCourses(List.of(courses.get(0), courses.get(1), courses.get(2)));
		students.get(4).setCourses(List.of(courses.get(2)));
		students.get(5).setCourses(List.of(courses.get(0), courses.get(2)));
	}

	private void studentAddToCourse(List<Course> courses, List<Student> students) {
		courses.get(0).setStudents(List.of(students.get(0), students.get(2), students.get(3), students.get(5)));
		courses.get(1).setStudents(List.of(students.get(0), students.get(1), students.get(3)));
		courses.get(2).setStudents(List.of(students.get(2), students.get(3), students.get(4), students.get(5)));
	}
}
