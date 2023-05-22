package org.jt.imagedocumentationretrive;

import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.jt.imagedocumentationretrive.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ImagedocumentationretriveApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImagedocumentationretriveApplication.class, args);
	}
	@Bean
	CommandLineRunner commandLineRunner(EmployeeRepository employeeRepository) {
		return args -> {
			var path = Paths.get("D:/img/java.jpg");
			var data = Files.readAllBytes(path);

			var bondPath = Path.of("D:/img/bond.txt");
			var bondData = Files.readString(bondPath);

			/* var employee = Employee.builder()
			.image(data)
			.bond(bondData)
			.build(); */

			//employeeRepository.save(employee);

			var employee = employeeRepository.findById("8a07e756-f9cb-4900-a5fe-347b23665679");
			if(employee.isPresent()){
				var employeeData = employee.get();
				PrintWriter printWriter = new PrintWriter("D:/img/employee.txt");
				printWriter.println(employeeData.getBond());
				printWriter.flush();
				printWriter.close();
			}else{
				System.out.println("Employee not found");
			}
		};
	}
}
