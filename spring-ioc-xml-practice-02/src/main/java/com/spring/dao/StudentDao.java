package com.spring.dao;

import com.spring.pojo.Student;

import java.util.List;

public interface StudentDao {
    /**
     * Query all student's records.
     */
    List<Student> queryAll();
}
