package com.example.Inventry.Service;


import com.example.Inventry.Entity.Inventory;
import com.example.Inventry.Repo.InventoryRepo;
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
