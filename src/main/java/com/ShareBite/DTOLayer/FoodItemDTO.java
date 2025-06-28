package com.ShareBite.DTOLayer;

import com.ShareBite.Entity.FoodItems;
import jakarta.validation.constraints.NotNull;
import java.util.List;
public class FoodItemDTO {

    @NotNull(message = "The categoray id can't be null")
    private String categorayName;

    @NotNull(message = "The items list can not be null")
    private List<String> foodItemList;

    public void setCategorayName(String categorayName){

        this.categorayName = categorayName;

    }
    public String getCategorayName(){

        return this.categorayName;

    }
    public void setFoodItemList(List<String> foodItemList){

        this.foodItemList = foodItemList;

    }
    public List<String>  getFoodItemList(){

        return this.foodItemList;

    }

}
