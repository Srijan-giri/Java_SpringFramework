package com.tut.SpringJDBC.Insertion;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */

// basic insertion operation
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("My Program Started");
        
        // spring jdbc---> JdbcTemplete
        
//        ApplicationContext context = new ClassPathXmlApplicationContext("com/tut/SpringJDBC/Insertion/config.xml");
//        JdbcTemplate templete=context.getBean("jdbcTemplete",JdbcTemplate.class);
        
        // insert query
        
//        String q = "insert into  student(id,name,city) values (?,?,?) ";
//        
        // fire the query
//        
//        int result = templete.update(q,476,"Uttam Kumar","Kolkata");
//        
//        System.out.println("number of record inserted...."+result);
//        
        
        
    }
}
