package org.jt.mongorelation.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.ToString;

@Document
@Builder
@ToString
public class Address {
    @Id
    private String addressId;
    private String city;
    private String state;
    private String country;
}
