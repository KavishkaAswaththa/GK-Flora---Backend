package com.example.inventry.service;


import com.example.inventry.entity.Inventory;
import com.example.inventry.repo.InventoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class InventoryService {
    @Autowired
    InventoryRepo inventoryRepo;

    public void save(Inventory inventory){
        inventoryRepo.save(inventory);
    }


}
