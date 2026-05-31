package com.ems.user;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("/auth")

@CrossOrigin(origins = "*")

public class UserController {

    
    @Autowired
    UserService service;

    
    
    @PostMapping("/register")

    public User register(
            @RequestBody User user) {

        return service.registerUser(user);
    }

    
    
    @PostMapping("/login")

    public String login(
            @RequestBody User user) {

        return service.loginUser(
                user.getEmail(),
                user.getPassword());
    }
}