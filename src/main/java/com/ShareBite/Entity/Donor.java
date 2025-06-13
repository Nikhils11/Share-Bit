package com.ShareBite.Entity;
import com.ShareBite.EmbededClass.*;

import jakarta.persistence.*;


import static jakarta.persistence.GenerationType.IDENTITY;
import com.ShareBite.Entity.*;

@Entity
public class Donor {


    @Column(nullable =false,unique = true)
    @GeneratedValue(strategy = IDENTITY)
    @Id
    private  long DonnerId ;


    @Column(nullable = false)
    @Embedded
    private Address address ;


    @Column(nullable = false)
    private String name;


    @Column(nullable = false)
    private long phoneNumber;




    private String typeOfDonner;


    @Column(nullable = false
       ,unique = true)
    private String email;


    @Column(nullable = false )
    private String password;

    @Column
    private Long menuId ;

    public void setMenuId(Long menuId){

        this.menuId = menuId;
    }
    public Long getMenuId(){

        return this.menuId;
    }

    public void setPassword(String password){

        this.password = password;
    }

    public String getPassword(){

        return this.password;
    }
    public void setEmail(String email){

        this.email = email;
    }

    public String getEmail(){

        return this.email;
    }


    public void setTypeOfDonner(String type){

        this.typeOfDonner = type;
    }

    public String getTypeOfDonner(){

        return this.typeOfDonner;
    }

    public void setPhoneNumber(long number){

        this.phoneNumber = number;
    }


    public long getPhoneNumber(){

        return this.phoneNumber;
    }

    public void setName(String name){

        this.name = name;
    }

    public String getName(){

        return this.name;
    }


    public void setDonnerId(long id){

        this.DonnerId = id;
    }

    public long getDonnerId(){

        return this.DonnerId;
    }


    public void setAdrres(Address adrress){

        this.address = adrress;
    }

    public Address getAddress(){

        return this.address;
    }




}
