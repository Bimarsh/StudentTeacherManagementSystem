package com.app.service;

import com.app.dao.UserDao;
import com.app.dao.UserDaoImpl;
import com.app.modal.User;

public class UserService {

	public User userLogin(User user){
		UserDao dao= new UserDaoImpl();
		User user1= new User();
		user1=dao.login(user);
		if(user1.getUsername()!=null)
		{
			user1.setValid(true);
		}
		return user1;
	}
	
}
