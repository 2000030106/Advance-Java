package com.sms.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.sms.dao.StudentDAO;
import com.sms.model.Student;

@Controller
public class StudentController {

    StudentDAO dao =
            new StudentDAO();

    @RequestMapping("/")

    public String index() {

        return "index";
    }

    @RequestMapping("/add")

    public String addStudent() {

        return "addstudent";
    }

    @PostMapping("/save")

    public String saveStudent(
            @ModelAttribute Student s) {

        dao.saveStudent(s);

        return "redirect:/view";
    }

    @RequestMapping("/view")

    public String viewStudents(Model model) {

        List<Student> list =
                dao.getAllStudents();

        model.addAttribute(
                "students",
                list);

        return "viewstudents";
    }

    @RequestMapping("/delete/{id}")

    public String deleteStudent(
            @PathVariable int id) {

        dao.deleteStudent(id);

        return "redirect:/view";
    }

    @RequestMapping("/edit/{id}")

    public String editStudent(
            @PathVariable int id,
            Model model) {

        Student s =
                dao.getStudent(id);

        model.addAttribute(
                "student",
                s);

        return "updatestudent";
    }

    @RequestMapping(value="/update")

    public String updateStudent(
            @ModelAttribute Student s) {

        dao.updateStudent(s);

        return "redirect:/view";
    }
}