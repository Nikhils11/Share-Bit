package com.ShareBite.ApiResponse;

import org.springframework.http.HttpStatusCode;

public class apiResponse  {


    private String response;
    private int  status;


    public apiResponse(String response,int status){

        this.response = response;
        this.status = status;
    }

    public apiResponse(){


    }

    public void setResponse(String response){

        this.response = response;


    }


    public String getResponse(){
        return this.response;
    }

    public void setStatus(int status){

        this.status = status;
    }

    public int getStatus(){

        return this.status;
    }
}

