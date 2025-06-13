package com.ShareBite.DTOLayer;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.springframework.lang.NonNull;

public class LoginDTO {

    @NonNull
    @Email(message  = "This email is not in a correct format")
    private String email;

    @NotNull
    @Size(min=8,max = 14)
    private String password;




public void setEmail(String email){

    this.email = email;
}



public String getEmail(){
    return this.email;
}

    public void setPassword(String password){

        this.password = password;
    }

    public String getPassword(){

        return this.password;
    }

}
