package com.spring.jdbc;

import com.spring.pojo.Student;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class JdbcTemplateTest {
    @Test
    void test() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-01.xml");

        JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);

        // Insert a record.
        String insert_sql = "insert into students (f_name, f_gender, f_age, f_class) values(?, ?, ?, ?)";
        int insert_rows = jdbcTemplate.update(insert_sql, "Kevin", "Male", "28", "High School Class 3");
        System.out.println("rows = " + insert_rows);

        // Select a record.
        String select_sql1 = "select * from students where id = ?";
        Student student1 = jdbcTemplate.queryForObject(select_sql1, (result, rowNum) -> {
            Student student = new Student();
            student.setId(result.getInt("id"));
            student.setName(result.getString("f_name"));
            student.setAge(result.getInt("f_age"));
            student.setGender(result.getString("f_gender"));
            student.setTheClass(result.getString("f_class"));
            return student;
        }, 1);
        System.out.println("student1 = " + student1);

        // Select some records.
        // Use aliases to map the column names to the field names of the Student class.
        String select_sql2 = "select id, f_name as name, f_gender as gender, f_age as age, f_class as theClass from students";
        List<Student> studentList = jdbcTemplate.query(select_sql2, new BeanPropertyRowMapper<Student>(Student.class));
        System.out.println("studentList = " + studentList);
    }
}
