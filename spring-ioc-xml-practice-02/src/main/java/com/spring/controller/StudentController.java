package com.spring.controller;

import com.spring.pojo.Student;
import com.spring.service.StudentService;

import java.util.List;

public class StudentController {
    private StudentService studentService;

    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    public void handleAll() {
        List<Student> studentList = studentService.handleAll();
        System.out.println("student list: " + studentList);
    }
}
