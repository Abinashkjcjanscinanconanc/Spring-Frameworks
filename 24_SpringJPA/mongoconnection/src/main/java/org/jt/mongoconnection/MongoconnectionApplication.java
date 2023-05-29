package org.jt.mongoconnection;

import java.util.List;

import org.bson.types.ObjectId;
import org.jt.mongoconnection.model.Address;
import org.jt.mongoconnection.model.Student;
import org.jt.mongoconnection.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.RequiredArgsConstructor;

@SpringBootApplication
@RequiredArgsConstructor
public class MongoconnectionApplication implements CommandLineRunner {
	private final StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(MongoconnectionApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var student = getStudent();

		studentRepository.save(student);

		// var optionalStudent = studentRepository.findById("647411b8f98c5d28f2b21ab1");
		// if (optionalStudent.isPresent()) {
		// System.out.println(optionalStudent.get());
		// } else {
		// System.out.println("No student");
		// }
	}

	private Student getStudent() {
		return Student.builder()
				.name("bastia")
				.roll(101)
				.fee(45678.98)
				.hobbies(List.of("cricket", "coding"))
				.address(new Address("ctc", "Odisha", "India"))
				.build();
	}

}
