package com.ShareBite.Entity;

import jakarta.persistence.*;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "foodItemsTable")
public class FoodItems {

    public FoodItems(long categorayId,String itemName){

        this.itemName = itemName;
        this.categorayId = categorayId;

    }

    @Id
    @GeneratedValue(strategy =  IDENTITY)
    private Long id ;


    @Column
    private String  itemName ;

    @Column
    private Long categorayId;

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

    public void setCategorayId(long categorayId){

        this.categorayId = categorayId;
    }

    public long getCategorayId(){

        return  this.categorayId;
    }

}
