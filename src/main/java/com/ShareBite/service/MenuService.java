package com.ShareBite.service;
import com.ShareBite.Entity.Donor;
import com.ShareBite.Entity.Menu;
import com.ShareBite.Repo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MenuService {

    @Autowired
    private DonorRepo donorRepo;

    @Autowired
    private MenuRepo menuRepo;


    public boolean checkIfEmailExists(String email){

        Donor  donor = donorRepo.findByEmail(email);


        if(donor != null){

            return true;
        }

        return false;


    }

    public Donor getdonor(String emial){

        return donorRepo.findByEmail(emial);

    }

    public long  saveMenu(String title){

        if(title == null){

            throw new RuntimeException("The title is null");
        }
        Menu menu = new Menu();
        menu.setTitle(title);
        menuRepo.save(menu);

        return menu.getId();

    }

    public void linkMenuToDonor(Long id , String email){

        if(id  == null ){

            throw new RuntimeException("Id can not be null while adding menu");
        }
        Donor donor  = donorRepo.findByEmail(email);

        donor.setMenuId(id);
        donorRepo.save(donor);

    }

    public List<Menu>  findMenu(){


       return menuRepo.findAll();


    }



}
