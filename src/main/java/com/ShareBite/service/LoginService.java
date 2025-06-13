package com.ShareBite.service;
import com.ShareBite.Repo.LoginRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.ShareBite.Entity.*;
import com.ShareBite.DTOLayer.*;
import java.util.List;
import  com.ShareBite.service.*;
@Service
public class LoginService {

    @Autowired
    private LoginRepo loginRepo;

    @Autowired
    private ValidationService validationService;

    public void  saveLoginInfo(Donor donor){

        Login newLogin  = new Login();
        if(donor.getEmail() == null ){

            throw  new RuntimeException("Save login throwing an null error");
        }
        newLogin.setEmail(donor.getEmail());
        newLogin.setPassword(donor.getPassword());


        loginRepo.save(newLogin);



    }


    public boolean checkIfEmailIsValid(LoginDTO loginDTO){


        if(loginDTO.getEmail() == null){

            throw new RuntimeException("Email can not be null");
        }


        return validationService.isEmailPresnetInDb(loginDTO.getEmail());


    }

    public boolean isPasswordCorrect(LoginDTO loginDTO){

        Login  newLogin = loginRepo.getReferenceById(loginDTO.getEmail());

        return newLogin.getPassword().equals(loginDTO.getPassword());
    }

    public List<Login> getallLogin(){

        return loginRepo.findAll();
    }


    public Login getuserDetails(LoginDTO loginDTO){


        return loginRepo.getReferenceById(loginDTO.getEmail());



    }




}
