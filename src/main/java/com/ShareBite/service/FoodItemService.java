package com.ShareBite.service;

import com.ShareBite.Entity.FoodItems;
import java.util.*;
import com.ShareBite.Repo.FoodItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodItemService {

    @Autowired
    private FoodItemRepo foodItemRepo;

    public void save(long catagorayId, List<String> itemList){

        for(String foodItems : itemList) {

            foodItemRepo.save(new FoodItems(catagorayId, foodItems));

        }

    }

    public List<FoodItems> getAllFoodItemsWithGievnId(long id){

        List<FoodItems> list  = foodItemRepo.findAll();
        List<FoodItems> listOfFoodItemForGivenId = new ArrayList<>();
        for(FoodItems items : list){

         if(items.getCategorayId() == id){

             listOfFoodItemForGivenId.add(items);
         }

        }
        return listOfFoodItemForGivenId;
    }

}
