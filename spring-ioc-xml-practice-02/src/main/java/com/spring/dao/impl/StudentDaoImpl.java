package com.spring.dao.impl;

import com.spring.dao.StudentDao;
import com.spring.pojo.Student;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class StudentDaoImpl implements StudentDao {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Student> queryAll() {
        String select_sql = "select id, f_name as name, f_gender as gender, f_age as age, f_class as theClass from students";
        List<Student> studentList = jdbcTemplate.query(select_sql, new BeanPropertyRowMapper<Student>(Student.class));
        return studentList;
    }
}
