package org.jt.gretting;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfig {

    @Bean
    public Student getStudent() {
        return new Student(101, "Smruti");
    }

    @Bean
    @Scope("prototype")
    public Student student() {
        return new Student(102, "banty");
    }
}
