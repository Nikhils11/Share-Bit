package com.ShareBite.Entity;

import jakarta.persistence.*;
import com.ShareBite.Entity.*;

import static jakarta.persistence.GenerationType.IDENTITY;
import java.util.List;


@Entity
@Table(name = "Menu")
public class Menu {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    @Column
    private String title;
    @JoinColumn
    private String donorId;
    public void setTitle(String title){

        this.title = title;
    }
    public String getTitle(){

        return this.title;
    }
    public void setId(long id){

        this.id  = id;

    }
    public long getId(){

        return this.id;
    }
    public void setDonorId(String donorId){

        this.donorId = donorId;

    }
    public String getDonorId(){
        return this.donorId;
    }
    @Override
    public String toString(){

        return this.title+this.id;
    }

}
