package com.spring.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.Date;

@Configuration
@PropertySource(value = "classpath:jdbc.properties")
public class BeanConfiguration {
    @Value("${mysql.username}")
    private String username;
    @Value("${mysql.password}")
    private String password;
    @Value("${mysql.url}")
    private String url;
    @Value("${mysql.driver}")
    private String driver;

    /**
     * Define a DataSource bean.
     * The bean id is the method name by default.
     */
    @Bean
    public DataSource dataSource() {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUsername(username);
        druidDataSource.setPassword(password);
        druidDataSource.setUrl(url);
        druidDataSource.setDriverClassName(driver);
        return druidDataSource;
    }

    /**
     * Define a JdbcTemplate bean.
     * Directly wire the datasSource bean with invocation of dataSource() method.
     */
    @Bean
    public JdbcTemplate jdbcTemplate() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource());
        return jdbcTemplate;
    }

    /**
     * Define a JdbcTemplate bean.
     * Directly wire the dataSource bean through parameter.
     */
    @Bean
    public JdbcTemplate jdbcTemplate2(DataSource dataSource) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);
        return new JdbcTemplate(dataSource);
    }
}
