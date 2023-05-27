package org.jt.manytoonerelation;

import java.util.List;

import org.jt.manytoonerelation.model.*;
import org.jt.manytoonerelation.repository.CourseRepository;
import org.jt.manytoonerelation.repository.TeacherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.RequiredArgsConstructor;

@SpringBootApplication
@RequiredArgsConstructor
public class ManytoonerelationApplication implements CommandLineRunner {
	private final TeacherRepository teacherRepository;
	private final CourseRepository courseRepository;

	public static void main(String[] args) {
		SpringApplication.run(ManytoonerelationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		var teacher1 = Teacher.builder()
				.teacherId(101)
				.teacherName("sam")
				.build();

		var teacher2 = Teacher.builder()
				.teacherId(102)
				.teacherName("hari")
				.build();

		var teacher3 = Teacher.builder()
				.teacherId(103)
				.teacherName("ram")
				.build();

		var teacher4 = Teacher.builder()
				.teacherId(104)
				.teacherName("jack")
				.build();

		var teacher5 = Teacher.builder()
				.teacherId(105)
				.teacherName("anshu")
				.build();

		var teacher6 = Teacher.builder()
				.teacherId(106)
				.teacherName("sai")
				.build();

		var course1 = Course.builder()
				.courseId(10001)
				.courseName("C")
				.build();

		var course2 = Course.builder()
				.courseId(10002)
				.courseName("C++")
				.build();

		var course3 = Course.builder()
				.courseId(10003)
				.courseName("JAVA")
				.build();

		course1.setTeachers(List.of(teacher1, teacher2));
		course2.setTeachers(List.of(teacher3, teacher4));
		course3.setTeachers(List.of(teacher5, teacher6));

		teacher1.setCourse(course1);
		teacher2.setCourse(course1);

		teacher3.setCourse(course2);
		teacher4.setCourse(course2);

		teacher5.setCourse(course3);
		teacher6.setCourse(course3);

		/*
		 * teacherRepository.saveAll(List.of(teacher1, teacher2, teacher3, teacher4,
		 * teacher5, teacher6));
		 */

		courseRepository.saveAll(List.of(course1, course2, course3));
	}

}
