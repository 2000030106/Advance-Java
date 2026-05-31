package com.sms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Student {

    @Id
    private int id;

    
    @NotBlank(message = "Name cannot be empty")
    private String name;

    
    @Email(message = "Invalid Email")
    private String email;

    
    @Size(min = 6,
          message = "Password must contain minimum 6 characters")
    private String password;

    
    
    public Student() {

    }

    
    public int getId() {
        return id;
    }

    
    public void setId(int id) {
        this.id = id;
    }

    
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    
    public String getEmail() {
        return email;
    }

    
    public void setEmail(String email) {
        this.email = email;
    }

    
    public String getPassword() {
        return password;
    }

    
    public void setPassword(String password) {
        this.password = password;
    }
}