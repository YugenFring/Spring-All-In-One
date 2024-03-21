package com.spring.service.impl;

import com.spring.dao.StudentDao;
import com.spring.pojo.Student;
import com.spring.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    private StudentDao studentDao;

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }
    @Override
    public List<Student> handleAll() {
        List<Student> studentList = studentDao.queryAll();
        return studentList;
    }
}
