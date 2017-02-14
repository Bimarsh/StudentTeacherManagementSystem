package com.app.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.app.dao.UserDao;
import com.app.modal.User;
import com.app.service.UserService;



@Controller
public class LoginController {

	@Autowired
	UserDao dao;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView index()
	{
		return new ModelAndView("index");
		
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public ModelAndView login(@ModelAttribute("loginform") User user)
	{
		System.out.println(user.getUsername());
		String page="index";
		User user1= dao.login(user);
		if(user1.isValid())
		{
			page="welcome";
		}
		
		return new ModelAndView(page);
	}
	
	
}
