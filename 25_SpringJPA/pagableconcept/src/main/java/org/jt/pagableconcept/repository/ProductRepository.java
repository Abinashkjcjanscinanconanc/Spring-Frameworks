package org.jt.pagableconcept.repository;

import org.jt.pagableconcept.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {

}
