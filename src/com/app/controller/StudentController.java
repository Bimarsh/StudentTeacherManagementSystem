package com.app.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.app.dao.StudentDao;
import com.app.modal.Student;

@Controller
public class StudentController {
	@Autowired
	StudentDao studentDao;

	@RequestMapping(value = "list", method = RequestMethod.GET)
	public ModelAndView listofStudents() {
		List<Student> students = studentDao.getallStudents();
		return new ModelAndView("listofStudents", "list", students);

	}

	@RequestMapping(value = "edit", method = RequestMethod.GET)
	public ModelAndView editStudent(@ModelAttribute("editStudentForm") Student student, Model model,
			HttpServletRequest request) {
		System.out.print(request.getParameter("id"));

		student = studentDao.getStudentById(request.getParameter("id"));
		model.addAttribute(student);
		return new ModelAndView("editForm");
	}

	@RequestMapping(value = "edit", method = RequestMethod.POST)
	public ModelAndView updateStudent(@ModelAttribute("editStudentForm") Student student) {

		studentDao.updateStudent(student);
		return new ModelAndView("welcome");
	}

	@RequestMapping(value = "add", method = RequestMethod.GET)
	public ModelAndView addStudent() {
			
			return new ModelAndView("addForm");
	}
	
	@RequestMapping(value = "add", method = RequestMethod.POST)
	public ModelAndView insertStudent(@ModelAttribute("addStudentForm") Student student) {
			
			studentDao.addStudent(student);
			System.out.println(student.getName());
			return new ModelAndView("welcome");
	}

}
