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

/*

TEST APIs USING POSTMAN
1. INSERT
Method
POST
URL
http://localhost:8080/students
Body → raw → JSON
{
  "id":1,
  "name":"Mahender",
  "email":"mahender@gmail.com"
}

Click:

Send
2. GET ALL STUDENTS
Method
GET
URL
http://localhost:8080/students

Output:

[
  {
    "id":1,
    "name":"Mahender",
    "email":"mahender@gmail.com"
  }
]
3. UPDATE STUDENT
Method
PUT
URL
http://localhost:8080/students
Body
{
  "id":1,
  "name":"Mahender Reddy",
  "email":"mahender@gmail.com"
}
4. DELETE STUDENT
Method
DELETE
URL
http://localhost:8080/students/1
	
*/