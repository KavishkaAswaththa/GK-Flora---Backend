package com.example.GKFlora.Repo;
import com.example.GKFlora.Entity.Delivery;
import org.springframework.data.mongodb.repository.MongoRepository;

import org.springframework.data.repository.CrudRepository;

public interface DeliveryRepo extends CrudRepository<Delivery,String> {
}
