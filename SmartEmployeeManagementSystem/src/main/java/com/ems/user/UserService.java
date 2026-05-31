package com.ems.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.ems.jwt.JwtUtil;

@Service

public class UserService {

    
    @Autowired
    UserRepository repo;

    
    
    BCryptPasswordEncoder encoder =
            new BCryptPasswordEncoder();

    
    
    public User registerUser(User user) {

        
        String encodedPassword =
                encoder.encode(
                        user.getPassword());

        
        user.setPassword(
                encodedPassword);

        
        return repo.save(user);
    }

    
    
    public String loginUser(
            String email,
            String password) {

        
        User user =
                repo.findByEmail(email);

        
        if(user == null) {

            return "User Not Found";
        }

        
        boolean match =
                encoder.matches(
                        password,
                        user.getPassword());

        
        if(match) {

            return JwtUtil
                    .generateToken(email);
        }

        
        return "Invalid Password";
    }
}