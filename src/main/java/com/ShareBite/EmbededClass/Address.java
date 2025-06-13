package com.ShareBite.EmbededClass;


import jakarta.persistence.Embeddable;
//import jakarta.persistence.Embeddedab;

@Embeddable
 public class Address {



 private String country ;
 private String city;

 private int pinCode;

 private String area;

 private String landMark;


 public String getCountry(){

  return this.country;
 }

 public void setCountry(String country){

  this.country = country;
 }

 public void setCity(String city){

  this.city = city;
 }


 public String getCity(){

  return this.city;


 }

 public void setPinCode(int pin ){

  this.pinCode = pin;
 }


 public int getPinCode(){
  return this.pinCode;
 }

 public void setArea(String area){

  this.area = area;
 }

 public String getArea(){

  return this.area;
 }


 public void setLandMark(String landMark){

  this.landMark = landMark;
 }

 public String getLandMark(){

  return this.landMark;
 }




}
