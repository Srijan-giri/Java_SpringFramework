package com.tut.SpringJDBC.practise.dao;

import java.util.List;

import com.tut.SpringJDBC.practise.entity.Employee;

public interface EmployeeDao {
   
	public int create();
    public int insert(Employee employee);
    public int update(Employee employee);
    public int delete(int id);
    public Employee getEmployee(int studentId);
    public List<Employee> getAllEmployees();
}
