package org.jt.jpaapplication;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

/**
 * Student
 */
@Entity
public class Student {
    @Id
    private int roll;
    private String name;
    private double fee;

    public Student() {
    }

    public Student(int roll, String name, double fee) {
        this.roll = roll;
        this.name = name;
        this.fee = fee;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

}