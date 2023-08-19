package com.tut.SpringJDBC.Insertion;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tut.SpringJDBC.Insertion.dao.StudentDao;
import com.tut.SpringJDBC.Insertion.entities.Student;

// actual insertion operation
public class Main {
	public static void main(String[] args) {
		System.out.println("Hello World");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/tut/SpringJDBC/Insertion/config.xml");
		StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
		
		Student student = new Student();
		student.setId(007);
		student.setName("James Bond");
		student.setCity("New York");
		
		int result  = studentDao.insert(student);
		
		System.out.println("student added ...."+result);
		
	}

}
