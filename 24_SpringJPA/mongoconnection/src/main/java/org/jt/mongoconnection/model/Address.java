package org.jt.mongoconnection.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Address {
    private String city;
    private String state;
    private String country;
}
