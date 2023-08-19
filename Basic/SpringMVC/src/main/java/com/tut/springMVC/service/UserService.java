package com.tut.springMVC.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tut.springMVC.dao.UserDao;
import com.tut.springMVCmodal.User;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;
	public int createUser(User user) {
		return this.userDao.saveUser(user);
	}

}
