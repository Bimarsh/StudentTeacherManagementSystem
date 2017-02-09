package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class LoginController {

	
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView login()
	{
		return new ModelAndView("index");
		
	}
	
}
