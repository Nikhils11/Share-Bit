package com.ShareBite.Controller;


import com.ShareBite.DTOLayer.CategorayDTO;
import com.ShareBite.service.FoodCategorayService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ShareBite.ApiResponse.*;

@RestController
@RequestMapping("add/categoray")
public class FoodCategorayController {

    @Autowired
    private FoodCategorayService categorayService;

    @PostMapping
public ResponseEntity<apiResponse> addCategoray(@Valid @RequestBody CategorayDTO categorayDTO){

    if(!categorayService.chcekIfEmailExist(categorayDTO.getEmail()) ){

        return  new ResponseEntity<>(new apiResponse("Donor with this email not found ",404) , HttpStatus.NOT_FOUND);
    }

    categorayService.addCategoray(categorayDTO);


    return new ResponseEntity<>(new apiResponse("Categoray was saved",200) , HttpStatus.OK);

}
//public List<>

}
