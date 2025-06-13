package com.ShareBite.Entity;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.security.Identity;

@Entity
@Table (name = "FoodCatagory")
public class FoodCatagory {

    @Column(nullable = false)
    private String catagory;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long serialNo;

    private long menuId;

    public void setMenuId(long menuId){

        this.menuId = menuId;

    }

    public long getMenuId(){

        return this.menuId;
    }

    public void setCatagory(String catagory){

        this.catagory = catagory;

    }

    public String getCatagory(){

        return this.catagory;
    }

    public long getSerialNo(){

        return this.serialNo;


    }

    public void setSerialNo(long serailNo){

        this.serialNo = serailNo;
    }

}
