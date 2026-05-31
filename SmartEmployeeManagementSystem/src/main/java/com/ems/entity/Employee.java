package com.ems.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy =
            GenerationType.IDENTITY)

    private int id;

    
    @NotBlank(message =
            "Name required")

    private String name;

    
    @Email(message =
            "Invalid email")

    private String email;

    
    @Size(min = 5,
            message =
            "Department minimum 5 chars")

    private String department;

    
    private double salary;

    private String imageName;

    private String resumeName;
    
    public Employee() {

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

    
    public String getDepartment() {
        return department;
    }

    
    public void setDepartment(
            String department) {

        this.department = department;
    }

    
    public double getSalary() {
        return salary;
    }

    
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String getImageName() {
        return imageName;
    }

    public void setImageName(
            String imageName) {

        this.imageName = imageName;
    }

    public String getResumeName() {
        return resumeName;
    }

    public void setResumeName(
            String resumeName) {

        this.resumeName = resumeName;
    }
}