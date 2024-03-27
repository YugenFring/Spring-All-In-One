package com.spring.service.impl;

import com.spring.dao.StudentDao;
import com.spring.pojo.Student;
import com.spring.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    private final StudentDao studentDao;

    @Autowired
    public StudentServiceImpl(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public List<Student> handleAll() {
        List<Student> studentList = studentDao.queryAll();
        return studentList;
    }
}
