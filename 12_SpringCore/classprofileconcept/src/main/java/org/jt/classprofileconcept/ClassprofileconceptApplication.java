package org.jt.classprofileconcept;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClassprofileconceptApplication implements CommandLineRunner {
	@Autowired
	@Qualifier("dog")
	private Animal animal;

	public static void main(String[] args) {
		var beans = SpringApplication.run(ClassprofileconceptApplication.class, args);
		// var animal = beans.getBean(Animal.class);
		// animal.eat();
	}

	@Override
	public void run(String... args) throws Exception {
		animal.eat();
	}
}
