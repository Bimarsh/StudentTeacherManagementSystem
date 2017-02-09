package com.app.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.modal.Student;
import com.app.service.StudentService;

/**
 * Servlet implementation class EditStudents
 */
@WebServlet(urlPatterns={"/edit"})
public class EditStudents extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditStudents() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id= request.getParameter("id");
		System.out.println("id: "+id);
		StudentService service= new StudentService();
		Student student= service.getStudentById(id);
		System.out.println("name: " +student.getName());
		request.setAttribute("student", student);
		RequestDispatcher dispatcher= request.getRequestDispatcher("views/editStudent.jsp");
		dispatcher.forward(request, response);
	}

}
