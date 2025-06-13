package com.ShareBite.Entity;

import jakarta.persistence.*;

import java.awt.*;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "foodItemsTable")
public class FoodItems {

    @Id
    @GeneratedValue(strategy =  IDENTITY)
    private Long id ;


    @Column
    private String  itemName ;

    @Column
    private Long catagoryId;

    public long getId(){

        return this.id;
    }

    public void setId(long id){

        this.id = id;
    }

    public void setItemName(String itemName){
        this.itemName = itemName;
    }
    public String getItemName(){
        return this.itemName;
    }

    public void setCatagoryId(long catagoryId){

        this.catagoryId = catagoryId;
    }

    public long getCatagoryId(){

        return  this.catagoryId;
    }

}
