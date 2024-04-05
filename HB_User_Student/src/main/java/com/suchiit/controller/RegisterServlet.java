package com.suchiit.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.suchiit.dao.UserDao;
import com.suchiit.daoimpl.UserDaoImpl;
import com.suchiit.pojo.UserEntity;

/**
 * Servlet implementation class RegisterServlet
 */
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int uid=Integer.parseInt(request.getParameter("uid"));
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String email=request.getParameter("uname");
		long mobilenumber=Long.parseLong(request.getParameter("mobilenumber"));
		String pwd=request.getParameter("pwd");
		UserDao daoimpl=new UserDaoImpl();
		boolean flag=daoimpl.register(new UserEntity(uid,fname,lname,email,mobilenumber,pwd));
		RequestDispatcher rd=null;
		if(flag==true)
		 {
			rd=request.getRequestDispatcher("./success.jsp") ;
			rd.forward(request, response);
		 }
		else
			
		{
			rd=request.getRequestDispatcher("./failure.jsp") ;
			rd.forward(request, response);
		}
		
		
	}

}
