package com.sms.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.validation.BindingResult;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.PostMapping;

import com.sms.entity.Student;

import com.sms.repository.StudentRepository;

import jakarta.validation.Valid;

@Controller
public class StudentController {

    
    @Autowired
    StudentRepository repo;

    
    
    @GetMapping("/")

    public String home(Model model) {

        model.addAttribute(
                "student",
                new Student());

        return "index";
    }

    
    
    @PostMapping("/save")

    public String saveStudent(

            @Valid
            @ModelAttribute Student student,

            BindingResult result,

            Model model) {

        
        if(result.hasErrors()) {

            return "index";
        }

        
        repo.save(student);

        model.addAttribute(
                "success",
                "Student Saved Successfully");

        return "success";
    }
}