package com.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.app.modal.Student;

public class StudentDaoImpl implements StudentDao {

	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet res = null;
	String user = "root";
	String password = "";
	String url = "jdbc:mysql://localhost:3306/ittraining";

	public Connection getConnection() {
		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}

	@Override
	public List<Student> getallStudents() {
		List<Student> studentsList = new ArrayList<Student>();

		String query = "select * from student";
		try {
			ps = getConnection().prepareStatement(query);
			res = ps.executeQuery();
			while (res.next()) {
				Student student = new Student();
				student.setId(res.getString("id"));
				student.setName(res.getString("name"));
				student.setAddress(res.getString("address"));
				// student.setSurname(res.getString("surname"));
				studentsList.add(student);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally
		{
			try {
				conn.close();
				ps.close();
				res.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return studentsList;
	}

	@Override
	public void deleteStudent(String id) {
		String query="delete from student where id=?";
		try {
			ps=getConnection().prepareStatement(query);
			ps.setString(1,id);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public Student getStudentById(String id) {
	Student student = new Student();	
    String query="select * from student where id=?";
    try {
		ps=getConnection().prepareStatement(query);
		ps.setString(1, id);
		System.out.println("id from dao: "+id);
		res=ps.executeQuery();
		while(res.next())
		{
		student.setId(res.getString("id"));
		student.setName(res.getString("name"));
		student.setAddress(res.getString("address"));
		student.setGrade(res.getString("marks"));
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		return student;
	}

	@Override
	public void updateStudent(Student student) {

		String query="update student set name=?,address=?,marks=? where id=?";
		try {
			ps=getConnection().prepareStatement(query);
			ps.setString(1, student.getName());
			ps.setString(2, student.getAddress());
			ps.setString(3, student.getGrade());
			ps.setString(4, student.getId());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
