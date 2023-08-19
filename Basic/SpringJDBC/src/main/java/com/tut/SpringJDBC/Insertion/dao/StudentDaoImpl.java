package com.tut.SpringJDBC.Insertion.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.tut.SpringJDBC.Insertion.entities.Student;

public class StudentDaoImpl implements StudentDao{

	
	private JdbcTemplate jdbcTemplete;
	
	

	public JdbcTemplate getJdbcTemplete() {
		return jdbcTemplete;
	}



	public void setJdbcTemplete(JdbcTemplate jdbcTemplete) {
		this.jdbcTemplete = jdbcTemplete;
	}



	public int insert(Student student) {
		// TODO Auto-generated method stub
		
         // insert query
        
        String q = "insert into  student(id,name,city) values (?,?,?) ";
        
        // value set
        
        int r = this.jdbcTemplete.update(q,student.getId(),student.getName(),student.getCity());
		
		
		return r;
	}

}
