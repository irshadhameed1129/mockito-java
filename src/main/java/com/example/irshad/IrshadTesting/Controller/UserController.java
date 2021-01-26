package com.example.irshad.IrshadTesting.Controller;


import com.example.irshad.IrshadTesting.Domain.User;
import com.example.irshad.IrshadTesting.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userProfileServices;

    @CrossOrigin(origins= "http://localhost:3000")
    @GetMapping( "/userlist")
    public List<User> fetchProductList () {
        List<User> products= new ArrayList<User>();
        //fetch data from database;
        products = userProfileServices.fetchUserList();
        return products;
    }


}
