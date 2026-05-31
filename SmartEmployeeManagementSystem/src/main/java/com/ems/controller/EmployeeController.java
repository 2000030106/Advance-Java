package com.ems.controller;

import java.util.List;
import java.io.File;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.data.domain.Page;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.validation.BindingResult;

import org.springframework.web.bind.annotation.*;

import com.ems.entity.Employee;
import com.ems.service.EmployeeService;

import jakarta.validation.Valid;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/employees")

public class EmployeeController {

    
    @Autowired
    EmployeeService service;

    
    
    @PostMapping

    public Employee addEmployee(

            @Valid
            @RequestBody Employee e,

            BindingResult result) {

        
        if(result.hasErrors()) {

            throw new RuntimeException(
                    result.getFieldError()
                    .getDefaultMessage());
        }

        return service.saveEmployee(e);
    }

    
    
    @GetMapping

    public List<Employee> getEmployees() {

        return service.getEmployees();
    }

    
    
    @PutMapping

    public Employee updateEmployee(
            @RequestBody Employee e) {

        return service.updateEmployee(e);
    }

    
    
    @DeleteMapping("/{id}")

    public String deleteEmployee(
            @PathVariable int id) {

        service.deleteEmployee(id);

        return "Employee Deleted";
    }
    @GetMapping("/search")

    public Page<Employee>
    searchEmployees(

    @RequestParam(defaultValue = "")
    String keyword,

    @RequestParam(defaultValue = "0")
    int page,

    @RequestParam(defaultValue = "5")
    int size) {

        
        return service
                .getEmployeesWithPagination(
                        page,
                        size,
                        keyword);
    }
    
    @PostMapping("/upload/{id}")

    public String uploadFile(

    @PathVariable int id,

    @RequestParam("image")
    MultipartFile image,

    @RequestParam("resume")
    MultipartFile resume)

    throws IOException {

        
        Employee employee =
                service.getEmployeeById(id);

        
        
        File uploadDir =
                new File("uploads");

        
        if(!uploadDir.exists()) {

            uploadDir.mkdir();
        }

        
        
        String imageName =
                image.getOriginalFilename();

        
        String resumeName =
                resume.getOriginalFilename();

        
        
        image.transferTo(

    new File(uploadDir + "/" + imageName)

        );

        
        
        resume.transferTo(

    new File(uploadDir + "/" + resumeName)

        );

        
        
        employee.setImageName(
                imageName);

        
        employee.setResumeName(
                resumeName);

        
        
        service.saveEmployee(employee);

        
        return "Files Uploaded Successfully";
    }
}