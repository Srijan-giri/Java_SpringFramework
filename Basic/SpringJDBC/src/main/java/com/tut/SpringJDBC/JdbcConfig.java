package com.tut.SpringJDBC;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.tut.SpringJDBC.dao.StudentDao;
import com.tut.SpringJDBC.dao.StudentDaoImpl;

@Configuration
@ComponentScan(basePackages = "com.tut.SpringJDBC.dao")
public class JdbcConfig {
	
	// @Bean("name of the bean")
	@Bean("ds")
	public DriverManagerDataSource getDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc_youtube");
		ds.setUsername("root");
		ds.setPassword("12345");
		
		return ds;
	}
		

	
	@Bean("jdbcTemplate")
	public JdbcTemplate getTemplete() {
		JdbcTemplate jdbcTemplete = new JdbcTemplate();
		jdbcTemplete.setDataSource(getDataSource());
		return jdbcTemplete;
		
	}
	
//	@Bean(name={"studentDao"})
//	public StudentDao getStudentDao() {
//		StudentDaoImpl studentDao = new StudentDaoImpl();
//		studentDao.setJdbcTemplete(getTemplete());
//		return studentDao;
//	}
}
