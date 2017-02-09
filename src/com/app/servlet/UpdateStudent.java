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
 * Servlet implementation class UpdateStudent
 */
@WebServlet(description = "updates the student", urlPatterns = { "/updateStudent" })
public class UpdateStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateStudent() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		StudentService service= new StudentService();
		Student student= new Student();
		System.out.println(request.getParameter("name"));
		System.out.println("hiddenid: "+request.getParameter("id"));
		student.setName(request.getParameter("name"));
		student.setAddress(request.getParameter("address"));
		student.setId(request.getParameter("id"));
		student.setGrade(request.getParameter("grade"));
		service.updateStudent(student);
		RequestDispatcher dispatcher= request.getRequestDispatcher("views/listofStudents.jsp");
		dispatcher.forward(request, response);
	}

}
