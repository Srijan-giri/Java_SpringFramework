package com.tut.SpringJDBC.practise.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.tut.SpringJDBC.practise.entity.Employee;

public class RowMapperImpl implements RowMapper<Employee>{

	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Employee e = new Employee();
		e.setId(rs.getInt(1));
		e.setName(rs.getString(2));
		e.setCity(rs.getString(3));
		e.setSalary(rs.getFloat(4));
		return e;
		
	}

}
