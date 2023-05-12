package org.jt.model;

import lombok.*;

import java.util.List;


@Getter
@Setter
@ToString(exclude = "fee")
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Student {
    private String name;
    private int roll;
    private double fee;
    private List<Course> courses;
}
