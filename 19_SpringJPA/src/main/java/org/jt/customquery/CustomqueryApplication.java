package org.jt.customquery;

import org.jt.customquery.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;

@SpringBootApplication
@RequiredArgsConstructor
public class CustomqueryApplication implements CommandLineRunner {
	private final StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(CustomqueryApplication.class, args);
	}

	@Transactional
	@Override
	public void run(String... args) throws Exception {
		// var result = studentRepository.updateFee(10000, 1000);
		var result = studentRepository.updateName("Banty", "Abhinas");
		System.out.println("Affected row : " + result);
	}

}
