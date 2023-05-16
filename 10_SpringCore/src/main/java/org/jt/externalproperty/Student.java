package org.jt.externalproperty;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
    @Value("${name}")
    private String name;
    @Value("${roll}")
    private int roll;
    @Value("#{${fee} - 1000}")
    private double fee;

    public String getName() {
        return name;
    }

    public int getRoll() {
        return roll;
    }

    public double getFee() {
        return fee;
    }

}
