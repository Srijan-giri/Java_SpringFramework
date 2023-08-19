package com.tut.SpringJDBC.Insertion.dao;

import com.tut.SpringJDBC.Insertion.entities.Student;

// er modhay je method gulo thakbe , tara database er sathe operation perform korbe
public interface StudentDao {

	// abstract method
	 public int insert(Student student);
}
