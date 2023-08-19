package com.tut.SpringJDBC;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tut.SpringJDBC.Entity.Student;
import com.tut.SpringJDBC.dao.StudentDao;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World");
//		ApplicationContext context = new ClassPathXmlApplicationContext("com/tut/SpringJDBC/config.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
	    StudentDao student = context.getBean("studentDao",StudentDao.class);
	    
	    
	    // Insertion
	    
	    
//	    Student st = new Student();
//	    st.setId(666);
//	    st.setName("Alok Manna");
//	    st.setCity("Durgapur");
//	    
//	    int result = student.insert(st);
//	    
//	    System.out.println("student added...."+result);
	    
	    
	    // Updation
	    
//	    Student st = new Student();
//	    st.setId(7);
//	    st.setName("Shah Rukh Khan");
//	    st.setCity("Mumbai");
//	    
//	    int result = student.update(st);
//	    System.out.println("Update successfully ..."+result);
//	
	       
	  // deletion
	    
//	    Student st = new Student();
//	    int r = student.delete(666);
//	    System.out.println("deleted successfully.."+r);
	    
	    
	    // select single data
	    
	    Student student1 = student.getStudent(222);
	    System.out.println(student1);
	    
	    // select all data from student
	    
	    List<Student> student2 = student.getAllStudent();
	    System.out.println(student2);
	    for(Student s : student2)
	    {
	    	System.out.println(s.getId()+" : "+s.getName()+" : "+s.getCity());
	    }
	
	
	
	}

}
