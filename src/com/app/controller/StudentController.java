package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.app.dao.StudentDao;
import com.app.modal.Student;




@Controller
public class StudentController {
@Autowired
StudentDao studentDao;

@RequestMapping(value="/list", method=RequestMethod.GET)
public ModelAndView listofStudents()
{
	List<Student> students=studentDao.getallStudents();
	return new ModelAndView("listofStudents", "list", students);
	
	}
	
	
}
