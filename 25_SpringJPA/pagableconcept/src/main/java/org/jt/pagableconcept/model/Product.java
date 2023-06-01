package org.jt.pagableconcept.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.ToString;

/**
 * Product
 */
@Document
@Builder
@ToString
public class Product {
    @Id
    private String productId;
    private String productName;
    private double productPrice;
}