package com.ShareBite.Entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "Login")
public class Login {



    @Column(nullable = false,unique = true)
     @Id
    private String email;


    @Column(nullable = false)
    private String password;

    @Column
    private Boolean isLoggedIn = false;

    public void setisLoggedIn(boolean isLoggedIn){

        this.isLoggedIn = isLoggedIn;
    }

    public boolean getisLoggedIn(){

        return this.isLoggedIn;
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



}
