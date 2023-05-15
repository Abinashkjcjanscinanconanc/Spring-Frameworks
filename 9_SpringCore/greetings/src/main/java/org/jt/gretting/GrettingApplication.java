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

//		var gretting1 = beans.getBean(Gretting.class);
//		var gretting2 = beans.getBean(Gretting.class);
//
//		System.out.println(gretting1 == gretting2);

        var student1 = beans.getBean("student", Student.class);
        var student2 = beans.getBean("student", Student.class);

        System.out.println(student1 == student2);
    }

}
