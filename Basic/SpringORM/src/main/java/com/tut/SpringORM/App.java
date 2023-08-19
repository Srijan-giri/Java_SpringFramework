package com.tut.SpringORM;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tut.SpringORM.dao.StudentDao;
import com.tut.SpringORM.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       System.out.println( "Program started.........!" );
       ApplicationContext context =   new ClassPathXmlApplicationContext("config.xml");
       StudentDao studentDao =  context.getBean("studentDao",StudentDao.class);
//       Student student = new Student(2324,"Durgesh Tiwari", "Lucknow");
//       int r = studentDao.insert(student);
//       System.out.println("done, "+r+" row inserted");
      boolean go =true;
      while(go) {
           Scanner sc = new Scanner(System.in);
           System.out.println("************welcome to spring orm project***************");
           System.out.println("   PRESS 1 for add new student\r\n"
           		+ "   PRESS 2 for display all students\r\n"
           		+ "   PRESS 3 for get detail of single student\r\n"
           		+ "   PRESS 4 for delete student\r\n"
           		+ "   PRESS 5 for update student \r\n"
           		+ "   PRESS 6 Exit "
        		);
           
         
           
           try {
        	   int choice = sc.nextInt();
        	   switch (choice) {
				   case 1:  
					      // add a new student
					      Student student = new Student();
					      System.out.println("Enter id :");
					      int id = sc.nextInt();
					      sc.nextLine();
					      
					      System.out.println("Enter the name");
					      String name = sc.nextLine();
					      sc.nextLine();
					      System.out.println("Enter the city");
					      String city = sc.nextLine();
					      
					      student.setStudentId(id);
					      student.setStudentName(name);
					      student.setStudentCity(city);
					      
					      int r = studentDao.insert(student);
					      System.out.println(r + " student added");
					      System.out.println("***************************");
					      System.out.println();
					      break;
	
				   case 2:  
				       // display all  students
					   System.out.println("****************************");
					   List<Student> students = studentDao.getAllStudents();
					   for(Student s : students)
					   {
						   System.out.println("\n Name : "+s.getStudentName()+"\n"+
								   " Id :"+s.getStudentId()+"\n"+
								   " City :"+s.getStudentCity()+"\n"
								   
								   );
						   System.out.println("__________________________");
					   }
				       break;
				       
				       
				   case 3:  
				       // get single student data
					   System.out.println("****************************");
					   
					   System.out.println("Enter user id:");
					   int userId = sc.nextInt();
					    sc.nextLine();
					    Student user_student = studentDao.getStudent(userId);
					  
					    System.out.println("\n Name : "+user_student.getStudentName()+"\n"+
								             " Id :"+user_student.getStudentId()+"\n"+
								             " City :"+user_student.getStudentCity()+"\n"
								   
								   );
					   System.out.println("__________________________");
					
				       break;
				       
				   case 4:  
				       // for delete student
					    System.out.println("Enter user id:");
					    int deleteId= sc.nextInt();
					    sc.nextLine();
					    studentDao.delete(deleteId);
					    System.out.println("Student Deleted");
				       break;
				       
				   case 5:
					   // update student
					      Student studentnew = new Student();
					      System.out.println("Enter student id :");
					      int new_id = sc.nextInt();
				
					      sc.nextLine();
					      System.out.println("Enter the new student name");
					      String new_name = sc.nextLine();
					 
					      sc.nextLine();
					      System.out.println("Enter the new student city");
					      String new_city = sc.nextLine();
					      
					      studentnew.setStudentId(new_id);
					      studentnew.setStudentName(new_name);
					      studentnew.setStudentCity(new_city);
					      
					      studentDao.updateStudent(studentnew);
					      
					      System.out.println("Student updated...");
					      System.out.println("*****************************");
					   break;
				   case 6 :
					  go=false;
					  break;
			  }  
           }
           
           catch(Exception e)
           {
        	   System.out.println("Invalid input try with another one .........");
        	   System.out.println(e.getMessage());
           }
           
           
       }
      
      System.out.println("Thank you using my application");
      System.out.println("See you soon ");
       
    }
}
