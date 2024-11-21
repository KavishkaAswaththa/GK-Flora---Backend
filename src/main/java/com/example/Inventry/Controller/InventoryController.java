package com.example.Inventry.Controller;


import com.example.Inventry.Entity.Inventory;
import com.example.Inventry.Service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/Inventory")

public class InventoryController {
    @Autowired
    private InventoryService inventoryService;


    @PostMapping(value = "/save")
    private String saveInventory(@RequestBody Inventory inventory) {

        inventoryService.save(inventory);
        return "Saved";

    }



}
