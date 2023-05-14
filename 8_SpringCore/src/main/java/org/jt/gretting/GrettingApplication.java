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
		var beans = SpringApplication.run(GrettingApplication.class, args);
		beans.getBean(HiApp.class).hi();

	}

}
