package org.jt.savemethodapplication;

import java.util.Arrays;

import java.util.List;
import org.jt.savemethodapplication.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SavemethodapplicationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SavemethodapplicationApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
		return args -> {
			var student1 = new Student(2, "Rashmi", 2000.0);
			var student2 = new Student(3, "Sikha", 1500.0);
			var student3 = new Student(4, "Raj", 2500.0);
			var student4 = new Student(5, "Rahul", 3000.0);

			/// studentRepository.saveAll(Arrays.asList(student1, student2, student3,
			/// student4));
			var students = List.of(student1, student2, student3, student4);
			studentRepository.saveAll(students);

			// studentRepository.deleteById(1);

			// System.out.println(studentRepository.existsById(1));
		};
	}
}
