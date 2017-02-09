package com.app.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.dao.StudentDao;
import com.app.dao.StudentDaoImpl;
import com.app.modal.Student;

/**
 * Servlet implementation class listofStudents
 */
@WebServlet(name = "listofStudents", urlPatterns = { "/list" })
public class ListofStudents extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ListofStudents() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		StudentDao dao = new StudentDaoImpl();
		List<Student> listofStudents = dao.getallStudents();
		request.setAttribute("list", listofStudents);
		RequestDispatcher dispatcher = request
				.getRequestDispatcher("views/listofStudents.jsp");
		dispatcher.forward(request, response);
	}
}
