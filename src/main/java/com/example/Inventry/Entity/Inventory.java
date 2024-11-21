package com.example.Inventry.Entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Inventory")
public class Inventory {

    @Id
    private int ItemId;
    private String ItemName;


    public Inventory(int ItemId,String ItemName){
        this.ItemId=ItemId;
        this.ItemName=ItemName;

    }


    public int get_id() {
        return ItemId;
    }

    //public void set_id(int ItemId) {
      //  this.ItemId = ItemId;
    //}
}
