package org.jt.employeeapplication;

import java.time.LocalDate;

import org.jt.employeeapplication.model.Employee;
import org.jt.employeeapplication.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.RequiredArgsConstructor;

@SpringBootApplication
@RequiredArgsConstructor
public class EmployeeapplicationApplication implements CommandLineRunner {
	private final EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(EmployeeapplicationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*
		 * var employee = Employee.builder()
		 * .employeeName("bunny")
		 * .employeeSalary(87654.98)
		 * .doj(LocalDate.of(1990, 5, 21))
		 * .feedBack(5)
		 * .build();
		 * 
		 * employeeRepository.save(employee);
		 */

		// var employees = employeeRepository.findAll();
		// employees.forEach(System.out::println);

		var optionalEmployee = employeeRepository.findById("908728e7-ed38-4910-89a2-e5b4adaed97c");
		if (optionalEmployee.isPresent()) {
			var employee = optionalEmployee.get();
			System.out.println(employee);
		} else {
			System.out.println("Employee not found");
		}
	}

}
