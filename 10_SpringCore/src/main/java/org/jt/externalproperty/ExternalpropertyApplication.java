package org.jt.externalproperty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExternalpropertyApplication {

	public static void main(String[] args) {
		var beans = SpringApplication.run(ExternalpropertyApplication.class, args);
		var student = beans.getBean(Student.class);

		System.out.println(student.getName());
		System.out.println(student.getRoll());
		System.out.println(student.getFee());
	}

}
