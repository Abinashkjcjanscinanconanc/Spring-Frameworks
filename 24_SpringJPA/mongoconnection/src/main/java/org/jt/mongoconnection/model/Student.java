package org.jt.mongoconnection.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Student {
    @Id
    private String id;
    private int roll;
    private String name;
    private double fee;
    private List<String> hobbies;
    private Address address;
}
