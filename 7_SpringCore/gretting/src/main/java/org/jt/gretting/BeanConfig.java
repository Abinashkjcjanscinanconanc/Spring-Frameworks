package org.jt.gretting;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public Student student() {
        return new Student(101, "Smruti");
    }
}
