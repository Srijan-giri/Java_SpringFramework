package com.tut.springMVC.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.tut.springMVCmodal.User;

@Repository
public class UserDao {
	@Autowired
	private HibernateTemplate hibernatetemplete;
	public int saveUser(User user)
	{
		Integer id = (Integer)this.hibernatetemplete.save(user);
		return id;
		
	}

}
