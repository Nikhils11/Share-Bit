package com.ShareBite.DTOLayer;
import com.ShareBite.EmbededClass.*;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;


public class DonorDTO {


    @NotNull (message = "Already exsit")
   private long Id;
    @Email(message="Invaild Operation")
    private String email;



    @NotNull(message = "Passwoard can't be null")
    private String password;


@NotNull(message = "Invalid adress")
private Address adress;


@NotNull(message =  "name can't be null")
private String name;

@NotNull
@Size(min = 10,max = 11)
private long number;

    public void setName(String name){

        this.name = name;
    }

    public String getName(){

        return this.name;
    }
public void setAdress(Address adress){

    this.adress = adress;
}

public Address getAdress(){

    return this.adress;
}



    public String getPassword(){

        return this.password;
    }

    public void setPassword(String passward){

        this.password = passward;
    }


    public void setId(long id){

        this.Id = id;
    }

    public long getId(){

        return this.Id;
    }

    public void setEmail(String email){

        this.email = email;
    }

    public String getEmail(){

        return this.email;
    }


    public long getNumber(){

        return this.number;
    }


    public void setNumber(long num){

        this.number =num;
    }

}
