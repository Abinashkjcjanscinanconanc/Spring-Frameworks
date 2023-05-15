package org.jt.lifecycle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LifecycleApplication {

	public static void main(String[] args) {
		System.out.println("Main method executed");
		var beans = SpringApplication.run(LifecycleApplication.class, args);
		var gretting = beans.getBean(Gretting.class);
		gretting.gretting();

	}

}
