package com.spring.controller;

import com.spring.pojo.Student;
import com.spring.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class StudentController {
    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    public void handleAll() {
        List<Student> studentList = studentService.handleAll();
        System.out.println("student list: " + studentList);
    }
}
