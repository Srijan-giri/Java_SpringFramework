package com.tut.SpringJDBC.practise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tut.SpringJDBC.practise.dao.EmployeeDao;
import com.tut.SpringJDBC.practise.entity.Employee;

public class App {
	public static void main(String[] args) throws NumberFormatException, IOException {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		EmployeeDao emp = context.getBean("employeeDao",EmployeeDao.class);
		
		// create table
//		int r = emp.create();
//		System.out.println("Created...."+r);
		
		// insert data into table
		
//		Employee e = new Employee();
//		
//		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		System.out.println("Enter the id :");
//		int id =Integer.parseInt(br.readLine());
//		System.out.println("Enter the name :");
//		String name = br.readLine();
//		System.out.println("Enter the city :");
//		String city = br.readLine();
//		System.out.println("Enter the salary :");
//		float salary =Float.parseFloat(br.readLine());
//		
//		e.setId(id);
//		e.setName(name);
//		e.setCity(city);
//		e.setSalary(salary);
//		
//		int result = emp.insert(e);
		
		
		
//		System.out.println("inserted...."+result);
		
		
		// update the data into table
		
//		Employee e = new Employee();
//		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("Enter the id :");
//		int id =Integer.parseInt(br.readLine());
//		System.out.println("Enter the name :");
//		String name = br.readLine();
//		System.out.println("Enter the city :");
//		String city = br.readLine();
//		System.out.println("Enter the salary :");
//		float salary =Float.parseFloat(br.readLine());
//		
//		e.setId(id);
//		e.setName(name);
//		e.setCity(city);
//		e.setSalary(salary);
//		
//		int result = emp.update(e);
//		System.out.println("updated...."+result);
		
		// delete the data into table
		
		
//		Employee e = new Employee();
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("Enter the id :");
//		int id =Integer.parseInt(br.readLine());
//		int result = emp.delete(id);
//		System.out.println("deleted...."+result);
		
		
		// select the single data from employee database
		
		Employee e = new Employee();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the id :");
		int id =Integer.parseInt(br.readLine());
		Employee e1 = emp.getEmployee(id);
		System.out.println(e1);
		
		// select all the data from employee database
		
		List<Employee> l = emp.getAllEmployees();
		for(Employee e2:l)
		{
			System.out.println(e2);
		}
		
		
		
	}

}
