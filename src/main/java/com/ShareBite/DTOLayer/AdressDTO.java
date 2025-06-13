package com.ShareBite.DTOLayer;


import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class AdressDTO {



    @NotNull(message ="pinCode can't be null")
    @Size(min=5,max = 10)
    private int pinCode;


    @NotNull(message ="LansMark can't be Null")
    public String landMark;


    @NotNull(message  ="Country filed can't be null")
    public String country;

    public String getLandMark(){

        return this.landMark;
    }

    public void setLandMark(String lM){

        this.landMark = lM;

    }

    public void setPinCode(int code){

        this.pinCode = code;
    }

    public int getPinCode(){

        return this.pinCode;
    }


}
