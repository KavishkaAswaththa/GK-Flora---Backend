package com.example.inventry.entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection="Inventory")
public class Inventory {

    @Id
    private String ItemId;
    private String ItemName;




    public Inventory(String ItemId,String ItemName){
        this.ItemId=ItemId;
        this.ItemName=ItemName;



    }


    public String get_id() {
        return ItemId;
    }

    //public void set_id(int ItemId) {
      //  this.ItemId = ItemId;
    //}
}
