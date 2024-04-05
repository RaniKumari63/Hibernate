package com.suchiit.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.suchiit.dao.AdminUserDao;
import com.suchiit.daoimpl.AdminUserDaoImpl;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	String uname1=request.getParameter("uname");
     String upwd1=request.getParameter("upwd");
	HttpSession ses=request.getSession();
	ses.setAttribute("uname1", uname1);
	ses.setAttribute("upwd1", upwd1);
	AdminUserDao daoimpl=new AdminUserDaoImpl();
	String utype=daoimpl.validUserNamePwd(uname1, upwd1);
	RequestDispatcher rd;
	if(utype.equalsIgnoreCase("A"))
	{
		rd=request.getRequestDispatcher("adminlogin.jsp");
		rd.forward(request, response);
		
	}
	else if(utype.equalsIgnoreCase("S"))
		
	{
		rd=request.getRequestDispatcher("userlogin.jsp");
		rd.forward(request, response);
	}
	else if(utype.equalsIgnoreCase("L"))
	{
		rd=request.getRequestDispatcher("view2.jsp");
		rd.forward(request, response);
	}
		
	}

}
