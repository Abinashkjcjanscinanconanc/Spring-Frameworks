package org.jt.yamlprofile;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Student
 */
@Component
public class Student {
    @Value("${name}")
    private String name;

    @Override
    public String toString() {
        return "Student [name=" + name + "]";
    }

}