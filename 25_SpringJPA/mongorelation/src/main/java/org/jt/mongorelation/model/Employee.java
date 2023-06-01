package org.jt.mongorelation.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Builder;
import lombok.ToString;

@Document
@Builder
@ToString
public class Employee {
    @Id
    private String employeeId;
    @Field("employeeName")
    private String name;
    private double salary;
    @DBRef
    private Address address;
}
