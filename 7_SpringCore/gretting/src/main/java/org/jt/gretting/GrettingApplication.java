package org.jt.gretting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("beans.xml")
public class GrettingApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext beans = SpringApplication.run(GrettingApplication.class, args);


		var gretting = beans.getBean(Gretting.class);
		gretting.greet();

		var hiApp = beans.getBean(HiApp.class);
		hiApp.hi();

		var student = beans.getBean(Student.class);
		System.out.println(student.getName() + "\t" + student.getRoll());

		var employee = beans.getBean(Employee.class);
		System.out.println(employee.getName()
		);
	}

}
