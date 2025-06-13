package com.ShareBite.DTOLayer;


import jakarta.validation.constraints.Email;

public class MenuDTO {


    private String title;


    @Email(message = "Invalid email")
    private String email;


    public void setTitle(String title){

        this.title =title;
    }

    public String getTitle(){

        return this.title;
    }

    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){

        return this.email;
    }

}
