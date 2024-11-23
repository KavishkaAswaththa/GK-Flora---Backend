package com.example.inventry.controller;


import com.example.inventry.entity.Inventory;

import com.example.inventry.service.ImageService;
import com.example.inventry.service.InventoryService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("api/Inventory")

public class InventoryController {
    @Autowired
    private InventoryService inventoryService;





    @PostMapping(value = "/save")
    private String saveInventory(@RequestBody Inventory inventory) {

        inventoryService.save(inventory);
        return inventory.get_id();

    }





}
