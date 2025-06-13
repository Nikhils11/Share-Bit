package com.ShareBite.Controller;

import com.ShareBite.Entity.Donor;
import com.ShareBite.Entity.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.ShareBite.ApiResponse.apiResponse;
import com.ShareBite.DTOLayer.MenuDTO;
import com.ShareBite.service.*;
import java.util.List;
@RestController
@RequestMapping("create/menu")
public class MenuController {

    @Autowired
    private MenuService menuService;


    @PostMapping
    public ResponseEntity<apiResponse> addAMenu( @RequestBody MenuDTO menu ){


        if(!menuService.checkIfEmailExists(menu.getEmail())){

            return new ResponseEntity<>(new apiResponse("This donor id do not exxist",404), HttpStatus.NOT_FOUND);
        }

        Long menuId = menuService.saveMenu(menu.getTitle());

        menuService.linkMenuToDonor(menuId,menu.getEmail());


        return new ResponseEntity<>(new apiResponse("Menu created",200), HttpStatus.OK);



    }

    @GetMapping
    public List<Menu> getMenu(){


        return menuService.findMenu();

    }
}
