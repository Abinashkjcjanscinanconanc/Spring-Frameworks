package org.jt.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Employee {
    private int id;
    private String name;
    private double salary;

}
