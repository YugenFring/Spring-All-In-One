package com.spring.dao.impl;

import com.spring.dao.StudentDao;
import com.spring.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDaoImpl implements StudentDao {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public StudentDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Student> queryAll() {
        String select_sql = "select id, f_name as name, f_gender as gender, f_age as age, f_class as theClass from students";
        List<Student> studentList = jdbcTemplate.query(select_sql, new BeanPropertyRowMapper<Student>(Student.class));
        return studentList;
    }
}
