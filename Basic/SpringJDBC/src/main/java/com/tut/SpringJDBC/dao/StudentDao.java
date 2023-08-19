package com.tut.SpringJDBC.dao;

import java.util.List;

import com.tut.SpringJDBC.Entity.Student;

public interface StudentDao {
	
	public int insert(Student student);
	public int update(Student student);
	public int delete(int id);
	public Student getStudent(int studentId);
	public List<Student> getAllStudent();

}
