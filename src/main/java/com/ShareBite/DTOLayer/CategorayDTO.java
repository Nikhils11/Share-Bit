package com.ShareBite.DTOLayer;

import jakarta.validation.constraints.Email;

public class CategorayDTO {

    private String categorayName ;

    @Email(message = "non valid email")
    private String email;

    public void setEmail(String email){

        this.email  = email;

    }

    public String getEmail(){

        return this.email;
    }

    public void setCatagorayName(String categorayName){

        this.categorayName  = categorayName;
    }
    public String getCategorayName(){

        return this.categorayName;
    }
}
