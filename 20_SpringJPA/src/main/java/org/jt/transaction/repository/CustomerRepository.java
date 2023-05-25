package org.jt.transaction.repository;

import org.jt.transaction.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CustomerRepository extends JpaRepository<Customer, String> {
    @Modifying
    @Query("UPDATE Customer SET balance = balance + :ib WHERE accountNumber = :ac")
    int increaseBalance(@Param("ac") String accountNumber, @Param("ib") double incrementBalance);

    @Modifying
    @Query("UPDATE Customer SET balance = balance - :db WHERE accountNumber = :ac")
    int decreaseBalance(@Param("ac") String accountNumber, @Param("db") double decrementBalance);
}
