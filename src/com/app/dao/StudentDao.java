package com.app.dao;

import java.util.List;

import com.app.modal.Student;

public interface StudentDao {

	public List<Student> getallStudents();
	public void addStudent(Student student);
	public void deleteStudent(String id);
	public Student getStudentById(String id);
	public void updateStudent(Student student);
	
	
	

}
