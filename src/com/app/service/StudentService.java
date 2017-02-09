package com.app.service;

import com.app.dao.StudentDao;
import com.app.dao.StudentDaoImpl;
import com.app.modal.Student;


public class StudentService {
	
	//TODO: Add function for displaying list of Students
	
	public void deleteStudentById(String id)
	{
		StudentDao dao= new StudentDaoImpl();
		dao.deleteStudent(id);
	}
	public Student getStudentById(String id)
	{
		StudentDao dao= new StudentDaoImpl();
		Student student=dao.getStudentById(id);
		return student;
	}
	public void updateStudent(Student student)
	{
		StudentDao dao= new StudentDaoImpl();
	    dao.updateStudent(student);
	}

}
