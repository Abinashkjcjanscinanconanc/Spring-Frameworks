package org.jt.gretting;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class B


    @Bean
    public Student getStudent() {
        return new Student(101, "Smruti");
    }

    @Bean
    public Student student() {
        return new Student(102, "banty");
    }
}
