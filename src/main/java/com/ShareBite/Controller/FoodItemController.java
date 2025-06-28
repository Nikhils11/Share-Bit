package com.ShareBite.Controller;
import com.ShareBite.DTOLayer.FoodItemDTO;
import com.ShareBite.service.FoodItemService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import com.ShareBite.ApiResponse.apiResponse;
import com.ShareBite.service.FoodCategorayService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/add-foodItems")
public class FoodItemController {

    @Autowired
    private FoodItemService foodItemService;

    @Autowired
    private FoodCategorayService foodCategorayService;

    @PostMapping
    public ResponseEntity<apiResponse> addFoodItem(@Valid @RequestBody FoodItemDTO foodItemDTO){


        if(!foodCategorayService.checkIfCatogoryExist(foodItemDTO.getCategorayName())){

            return new ResponseEntity<>(new apiResponse("The catagory do not exist",404), HttpStatus.NOT_FOUND);

        }
        long categorayId = foodCategorayService.getCatagorayId(foodItemDTO.getCategorayName());
        foodItemService.save(categorayId,foodItemDTO.getFoodItemList());
        return new ResponseEntity<>(new apiResponse("Food iteams saved sucessufly",202), HttpStatus.OK);

    }

}
