package org.jt.model;

import lombok.*;


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

}
