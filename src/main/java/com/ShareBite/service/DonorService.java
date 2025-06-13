package com.ShareBite.service;
import com.ShareBite.DTOLayer.DonorDTO;
import com.ShareBite.Entity.*;
import com.ShareBite.Repo.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ShareBite.service.LoginService;

import java.util.List;

@Service
public class DonorService {



    @Autowired
    private DonorRepo userRepo;

    @Autowired
    private LoginService loginService;

 @Autowired
 private ValidationService validationService;


public List<Donor> findAll (){


    return userRepo.findAll();
}

public void registerDonor ( @Valid DonorDTO donor){




    if(validationService.isIdAndEmailUnique(donor.getId(), donor.getEmail())){


        throw  new RuntimeException("The email Already Exists");

    }

   

    if(userRepo.existsById(donor.getId())){

        throw  new RuntimeException("The id already exsists ");
    }


    Donor donornew = new Donor();

    donornew.setAdrres(donor.getAdress());
    donornew.setPassword(donor.getPassword());

    donornew.setEmail(donor.getEmail());
    donornew.setName(donor.getName());
    donornew.setPhoneNumber(donor.getNumber());

    userRepo.save(donornew);
    loginService.saveLoginInfo(donornew);

}






}
