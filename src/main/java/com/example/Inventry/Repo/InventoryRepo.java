package com.example.Inventry.Repo;


import com.example.Inventry.Entity.Inventory;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryRepo extends MongoRepository<Inventory,Integer> {
}
