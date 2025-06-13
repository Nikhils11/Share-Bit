package com.ShareBite.service;
import com.ShareBite.Entity.*;
import com.ShareBite.Repo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ValidationService {


    @Autowired
private DonorRepo donorRepo;

    @Autowired
    private LoginRepo loginRepo;

    public boolean isIdAndEmailUnique(long id,String email){

       boolean asns1  = donorRepo.existsById(id);
      boolean ans2  = false;

       if(donorRepo.findByEmail(email) == null){

           ans2 =true;

       }

       return asns1 && ans2;
    }

    public boolean isEmailPresnetInDb(String email){

        if(email == null){

            return false;
        }

        return loginRepo.existsByEmail(email);
    }
}
