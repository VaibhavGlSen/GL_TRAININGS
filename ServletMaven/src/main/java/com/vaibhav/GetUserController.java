package com.vaibhav;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vaibhav.web.dao.UserDao;
import com.vaibhav.web.model.User;

/**
 * Servlet implementation class GetUserController
 */
public class GetUserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	   int id= Integer.parseInt(request.getParameter("id"));
	   
	   UserDao dao=new UserDao();
	   User a1= dao.getUser(id);
	   request.setAttribute("User", a1);
	   RequestDispatcher rd=request.getRequestDispatcher("ShowUser.jsp");
	   rd.forward(request, response);
	}

	

}
