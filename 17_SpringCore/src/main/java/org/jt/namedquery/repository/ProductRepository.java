package org.jt.namedquery.repository;

import java.util.List;
import java.util.Optional;

import org.jt.namedquery.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
    Optional<Product> findByProductName(String productName);

    List<Product> findAllByProductPriceGreaterThan(double price);
}
