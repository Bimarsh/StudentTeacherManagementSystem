/*package com.app.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.app.modal.User;
import com.app.service.UserService;

*//**
 * Servlet implementation class LoginServlet
 *//*
@WebServlet(name = "loginServlet", urlPatterns = { "/", "/login" })
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	*//**
	 * Default constructor.
	 *//*
	public LoginServlet() {
		// TODO Auto-generated constructor stub
	}

	*//**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 *//*
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher dispatcher = request
				.getRequestDispatcher("views/index.jsp");
		dispatcher.forward(request, response);
	}

	*//**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 *//*
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("postmethod");
		User user = new User();
		user.setUsername(request.getParameter("username"));
		user.setPassword(request.getParameter("password"));
		UserService service= new UserService();
		User user1=service.userLogin(user);
		
		if(!user1.isValid())
		{
			request.setAttribute("message", "Invalid Username & password");
			RequestDispatcher dispatcher = request
					.getRequestDispatcher("views/index.jsp");
			dispatcher.forward(request, response);
		}
		else
		{
			request.setAttribute("user", user1);
			HttpSession session = request.getSession(false);
			session.setAttribute("user", user1);
			RequestDispatcher dispatcher = request
					.getRequestDispatcher("views/welcome.jsp");
			dispatcher.forward(request, response);
		}

	}
}
*/