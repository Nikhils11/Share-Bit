package com.ShareBite.Controller;


import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.ShareBite.DTOLayer.*;
import com.ShareBite.service.LoginService;
import com.ShareBite.ApiResponse.*;
import com.ShareBite.Entity.*;
import java.util.List;


@RestController
@RequestMapping("login")
public class LoginController {

    @Autowired
    private LoginService loginService;


    @PostMapping()
    public ResponseEntity<apiResponse> checkFoUserLogin(@Valid @RequestBody LoginDTO loginDTO, HttpSession session){


        if(!this.loginService.checkIfEmailIsValid(loginDTO)){

             return new ResponseEntity<>(new apiResponse("The emial given is not correct or it is empty",404),HttpStatus.NOT_FOUND);
        }
        if(!this.loginService.isPasswordCorrect(loginDTO)){

            return new ResponseEntity<>(new apiResponse("The password given is not correct or it is empty",400),HttpStatus.BAD_REQUEST);
        }

        Login loggedIn  = loginService.getuserDetails(loginDTO);
        loggedIn.setisLoggedIn(true);

        return new ResponseEntity<>(new apiResponse("Login unsucsesFull",200),HttpStatus.OK);


    }



    @GetMapping
    public List<Login> findAll(){

        return loginService.getallLogin();
    }




}
