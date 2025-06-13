package com.ShareBite.service;
import com.ShareBite.Entity.Donor;
import com.ShareBite.Entity.FoodCatagory;
import com.ShareBite.Repo.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ShareBite.DTOLayer.CategorayDTO;

import java.util.List;

@Service
public class FoodCategorayService {

@Autowired
private MenuRepo menuRepo;

@Autowired
    private FoodCategorayRepo foodCategorayRepo;

@Autowired
private DonorRepo donorRepo;


public void addCategoray( CategorayDTO categorayDTO){

    Donor donor  =  donorRepo.findByEmail(categorayDTO.getEmail());

    Long id  = donor.getMenuId();
    if(id == null){

        throw new RuntimeException("The menu id is null");
    }

    FoodCatagory catagoray = new FoodCatagory();
    catagoray.setMenuId(id);
    catagoray.setCatagory(categorayDTO.getCategorayName());

    foodCategorayRepo.save(catagoray);

}


public boolean chcekIfEmailExist(String email){

    Donor donor = donorRepo.findByEmail(email);

    if(donor == null){

        return false;
    }
    return true;

}

public List<FoodCatagory> findAll(){

    return  foodCategorayRepo.findAll();
}


}
