package org.jt.officeapplication;

import org.jt.officeapplication.model.Student;
import org.jt.officeapplication.model.Verfication;
import org.jt.officeapplication.repository.StudentRepository;
import org.jt.officeapplication.repository.VerficationRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.RequiredArgsConstructor;

@SpringBootApplication
@RequiredArgsConstructor
public class OfficeapplicationApplication implements CommandLineRunner {
	private final StudentRepository studentRepository;
	private final VerficationRepository verficationRepository;

	public static void main(String[] args) {
		SpringApplication.run(OfficeapplicationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*
		 * var verfication = new Verfication("123456789", "ctc", "odisha");
		 * var student = new Student(100, "smruti", verfication);
		 * 
		 * verficationRepository.save(verfication);
		 * studentRepository.save(student);
		 */

		// studentRepository.findAll().forEach(System.out::println);

		// getStudent(100);

	}

	private void getStudent(int roll) {
		var optionalStudent = studentRepository.findById(roll);

		if (optionalStudent.isPresent()) {
			var student = optionalStudent.get();

			System.out.println("Roll: " + student.getRoll());
			System.out.println("Name: " + student.getName());

			var verification = student.getVerfication();

			System.out.println("Adhare Number: " + verification.getAddharNumber());
			System.out.println("City: " + verification.getCity());
			System.out.println("State: " + verification.getState());

		} else {
			System.out.println("No student found");
		}
	}

}
