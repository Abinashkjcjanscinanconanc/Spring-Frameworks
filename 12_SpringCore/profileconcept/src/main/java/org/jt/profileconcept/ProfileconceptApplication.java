package org.jt.profileconcept;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProfileconceptApplication {

	public static void main(String[] args) {
		var beans = SpringApplication.run(ProfileconceptApplication.class, args);
		var employee = beans.getBean(Employee.class);

		System.out.println(employee);
	}

}
