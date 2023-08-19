package com.tut.SpringJDBC.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.tut.SpringJDBC.Entity.Student;

@Component("studentDao")
public class StudentDaoImpl implements StudentDao{
    @Autowired
	private JdbcTemplate jdbcTemplete;
	public int insert(Student student) {
		
		String q = "insert into student(id,name,city) values(?,?,?)";
		int r = this.jdbcTemplete.update(q,student.getId(),student.getName(),student.getCity());
		return r;
	}
	public JdbcTemplate getJdbcTemplete() {
		return jdbcTemplete;
	}
	public void setJdbcTemplete(JdbcTemplate jdbcTemplete) {
		this.jdbcTemplete = jdbcTemplete;
	}
	public int update(Student student) {
		String q ="update student set name=?,city=? where id=?";
		int r = this.jdbcTemplete.update(q,student.getName(),student.getCity(),student.getId());
		return r;
	}
	public int delete(int id) {
		// TODO Auto-generated method stub
		String q ="delete from student where id=?";
		int r = this.jdbcTemplete.update(q,id);
		return r;
	}
	public Student getStudent(int studentId) {
		// Selecting single student data
		String q ="select * from student where id=?";
		RowMapper<Student> rowMapper = new RowMapperImpl();
		Student student = this.jdbcTemplete.queryForObject(q,rowMapper,studentId);
		
		return student;
	}
	public List<Student> getAllStudent() {
		String q = "select * from student";
		RowMapper<Student> rowMapper = new RowMapperImpl();
		List<Student> student= this.jdbcTemplete.query(q,rowMapper);
		return student;
	}
	
	

}
