package com.springApp.App.Login;

import com.springApp.daos.UsersDao;
import com.springApp.objects.dataBase.Users;

public class LoginRequestProcessor {
	
	public void get(Users user, UsersDao usersDao) {
		System.out.println("user: " + user.getUserName());
		System.out.println("pass: " + user.getUserPass());
		
		Users userBD = usersDao.getUserByName(user.getUserName());
		
		if (user.getUserPass().toUpperCase().equals(userBD.getUserPass().toUpperCase())) {
			user.setParameter("user", user);
			user.setView("main");
		} else {
			user.setParameter("msg", "Incorrect user or password, try it again");
			user.setView("login");
		}
	}
	
}
