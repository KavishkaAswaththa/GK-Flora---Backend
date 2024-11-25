package com.example.inventry.Repo;

import com.example.inventry.Entity.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends MongoRepository<Customer, String> {

    // Custom query method to find a customer by email
    Customer findByEmail(String email);
}
