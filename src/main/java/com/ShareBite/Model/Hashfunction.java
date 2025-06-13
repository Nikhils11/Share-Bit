package com.ShareBite.Model;

import java.util.Random;
public class Hashfunction {
    private int value;
//    Instacnce var;
    private int key ;

    public int hashCode(){

        Random rand = new Random();
    int sum = 0 ;
    for(int i= 0 ; i < 5; i++){

        sum  = rand.nextInt(10000);
    }

    return sum;


    }
}
