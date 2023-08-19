package com.tut.SpringJDBC.practise.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.tut.SpringJDBC.practise.entity.Employee;

@Component("employeeDao")
public class EmployeeDaoImpl implements EmployeeDao{

//	public int insert(Employee employee) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
	@Autowired
	private JdbcTemplate jdbcTemplete;

	public JdbcTemplate getJdbcTemplete() {
		return jdbcTemplete;
	}

	public void setJdbcTemplete(JdbcTemplate jdbcTemplete) {
		this.jdbcTemplete = jdbcTemplete;
	}

	// create a table
	public int create() {
		String q ="create table employee(id int primary key not null,name varchar(25) not null,city varchar(25) not null,salary decimal(10,2) not null)";
		int r = this.jdbcTemplete.update(q);
		return r;
	}

	// insert data into table
	public int insert(Employee employee) {
		String q = "insert into employee(id,name,city,salary) values(?,?,?,?)";
		int r = this.jdbcTemplete.update(q,employee.getId(),employee.getName(),employee.getCity(),employee.getSalary());
		return r;
	}

	public int update(Employee employee) {
		String q ="update employee set name=?,city=?,salary=? where id=?";
		int r = this.jdbcTemplete.update(q,employee.getName(),employee.getCity(),employee.getSalary(),employee.getId());
		return r;

	}

	public int delete(int id) {
		String q = "delete from employee where id=?";
		int r = this.jdbcTemplete.update(q,id);
		return r;
	}

	public Employee getEmployee(int studentId) {
		String q = "select * from employee where id=?";
		RowMapper<Employee> rowMapper = new RowMapperImpl();
		Employee e = this.jdbcTemplete.queryForObject(q, rowMapper,studentId);
		return e;
	}

	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		String q ="select * from employee";
		RowMapper<Employee> rowMapper = new RowMapperImpl();
		List<Employee> li = this.jdbcTemplete.query(q,rowMapper);
		return li;
	}
	
	

}
