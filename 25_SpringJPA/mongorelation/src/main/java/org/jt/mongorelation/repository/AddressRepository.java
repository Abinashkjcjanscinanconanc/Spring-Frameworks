package org.jt.mongorelation.repository;

import org.jt.mongorelation.model.Address;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AddressRepository extends MongoRepository<Address, String> {

}
