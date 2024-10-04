package com.gfarm.security.controller;

import com.gfarm.security.entiry.Users;
import com.gfarm.security.impl.JWTService;
import com.gfarm.security.repo.UserRepo;
import com.gfarm.security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping("/register")
    public Users register(@RequestBody Users user){
        return userService.register(user);
    }
    @PostMapping("/login")
    public String login(@RequestBody Users user){
        return userService.verify(user);
    }
}
