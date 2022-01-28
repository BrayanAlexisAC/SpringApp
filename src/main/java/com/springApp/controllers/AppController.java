package com.springApp.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.springApp.objects.dataBase.Users;

@Controller
public class AppController {
	
	@ModelAttribute
	public void setAttributes(HttpServletRequest request, Model model, Users user) {
		HttpSession session = request.getSession();
		session.setAttribute("userName", user.getUserName());
	}
	
}
