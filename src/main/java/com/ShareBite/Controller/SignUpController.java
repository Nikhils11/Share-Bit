package com.ShareBite.Controller;
import com.ShareBite.DTOLayer.DonorDTO;
import com.ShareBite.service.*;
import com.ShareBite.Entity.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/signup")
public class SignUpController {


    @Autowired
    private DonorService donorService;

    @Autowired
    private ValidationService validationService;


    @PostMapping("/donor")
    public void saveDonor (@Valid @RequestBody DonorDTO d){


         donorService.registerDonor(d);

    }


    @GetMapping
    public List<Donor> findAll(){

        return donorService.findAll();
    }


}
