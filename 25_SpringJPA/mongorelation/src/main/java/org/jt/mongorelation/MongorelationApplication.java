package org.jt.mongorelation;

import org.jt.mongorelation.model.Address;
import org.jt.mongorelation.model.Employee;
import org.jt.mongorelation.repository.AddressRepository;
import org.jt.mongorelation.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.RequiredArgsConstructor;
import lombok.var;

@SpringBootApplication
@RequiredArgsConstructor
public class MongorelationApplication implements CommandLineRunner {

	private final EmployeeRepository employeeRepository;
	private final AddressRepository addressRepository;

	public static void main(String[] args) {
		SpringApplication.run(MongorelationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var optionalEmployee = employeeRepository.findById("6477fd38ad696b7ae821eaf4");
		if (optionalEmployee.isPresent()) {
			System.out.println(optionalEmployee.get());
		} else {
			System.out.println("Not found");
		}
	}

	public void addEmployee() {
		var address = Address.builder()
				.city("ctc")
				.state("odisha")
				.country("india")
				.build();

		var employee = Employee.builder()
				.name("smruti")
				.salary(34567.98)
				.address(address)
				.build();

		addressRepository.save(address);
		employeeRepository.save(employee);
	}

}
