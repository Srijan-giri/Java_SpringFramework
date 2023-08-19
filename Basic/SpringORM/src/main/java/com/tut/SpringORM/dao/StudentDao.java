package com.tut.SpringORM.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.tut.SpringORM.entities.Student;

public class StudentDao {
	
    private HibernateTemplate hibernateTemplate;

   @Transactional
    public int insert(Student student) {
        Integer i = (Integer) this.hibernateTemplate.save(student);
        System.out.println("inserted");
        return i;
    }
   
   // get the single data (object)
   public Student getStudent(int studentId)
   {
     System.out.println("get single data");
	 Student student_details = this.hibernateTemplate.get(Student.class,studentId);
//	 System.out.println(student_details);
	 return student_details;
	   
   }

    // get all rows 
   public List<Student> getAllStudents()
   {
	 System.out.println("get all data");
	List<Student> students  = this.hibernateTemplate.loadAll(Student.class);
	return students;
	   
   }
   
   
   //delete the data
   @Transactional
   public void delete(int studentId)
   {
	Student student = this.hibernateTemplate.get(Student.class,studentId);
	this.hibernateTemplate.delete(student);
	System.out.println("Deleted.....");
   }
   
   
   // update the data
   @Transactional
   public void updateStudent(Student student)
   {
	 this.hibernateTemplate.update(student);  
	 System.out.println("Updated....");
   }
   
   
   
    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
}
