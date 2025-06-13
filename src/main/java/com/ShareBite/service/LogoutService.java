package com.ShareBite.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.ShareBite.Repo.LoginRepo;
import com.ShareBite.Entity.Login;
import com.ShareBite.ApiResponse.apiResponse;
@Service
public class LogoutService {


    private LoginRepo  loginRepo;


    public ResponseEntity<apiResponse> logoutUser(String userId){


        Login user = loginRepo.getReferenceById(userId);

        if(user.getisLoggedIn() == false){

            return new ResponseEntity<>(new apiResponse("User is already logout",200), HttpStatus.OK);
        }
        user.setisLoggedIn(false);
        return new ResponseEntity<>(new apiResponse("User is already logout",200), HttpStatus.OK);

    }





}
