package com.sms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.sms.entity.Student;
import com.sms.repository.StudentRepository;

@RestController
public class StudentController {

    @Autowired
    StudentRepository repo;

    
    // INSERT

    @PostMapping("/students")
    public Student insertStudent(
            @RequestBody Student s) {

        return repo.save(s);
    }

    
    // GET ALL

    @GetMapping("/students")
    public List<Student> getStudents() {

        return repo.findAll();
    }

    
    // GET BY ID

    @GetMapping("/students/{id}")
    public Student getStudent(
            @PathVariable int id) {

        return repo.findById(id).get();
    }

    
    // UPDATE

    @PutMapping("/students")
    public Student updateStudent(
            @RequestBody Student s) {

        return repo.save(s);
    }

    
    // DELETE

    @DeleteMapping("/students/{id}")
    public String deleteStudent(
            @PathVariable int id) {

        repo.deleteById(id);

        return "Deleted Successfully";
    }
}