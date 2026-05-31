package com.sms.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    
    @ExceptionHandler(StudentNotFoundException.class)

    public String handleStudentException(
            StudentNotFoundException ex,
            Model model) {

        model.addAttribute(
                "error",
                ex.getMessage());

        return "error";
    }
}