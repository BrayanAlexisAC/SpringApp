package com.springApp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springApp.App.Login.LoginRequestProcessor;
import com.springApp.daos.UsersDao;
import com.springApp.objects.dataBase.Users;

@Controller
public class LoginController extends AppController {
	@Autowired
	private UsersDao usersDao;
	private LoginRequestProcessor processor = null;
	
	public LoginController() {
		processor = new LoginRequestProcessor();
	}	
	
	@RequestMapping(path = "/getUser", method = RequestMethod.POST)
	public ModelAndView get(@ModelAttribute Users user) {
		System.out.println("I'm here at login controller");
		processor.get(user, usersDao);
		return user.getModelAndView();
	}
}
