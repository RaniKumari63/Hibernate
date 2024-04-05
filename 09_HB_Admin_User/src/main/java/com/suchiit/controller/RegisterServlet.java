package com.suchiit.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.suchiit.dao.AdminUserDao;
import com.suchiit.daoimpl.AdminUserDaoImpl;
import com.suchiit.entity.AdminUser_Entity;

/**
 * Servlet implementation class RegisterServlet
 */
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		HttpSession ses=request.getSession(false);
		String uname1=(String)ses.getAttribute("uname1");
		String upwd1=(String)ses.getAttribute("upwd1"); 
		ses.setAttribute("uname1", uname1);
		ses.setAttribute("upwd1", upwd1);
		String uname=request.getParameter("uname");
	     String upwd=request.getParameter("upwd");
	     String uemail=request.getParameter("useremail");
	     long umobile=Long.parseLong(request.getParameter("umobile"));
	     String utype=request.getParameter("utype");
	     int courseid=Integer.parseInt(request.getParameter("courseid"));
	     AdminUser_Entity adduser=new AdminUser_Entity(uname,upwd,uemail,courseid,umobile,utype);
		AdminUserDao daoimpl=new AdminUserDaoImpl();
		
		boolean flag=daoimpl.register(adduser);
		RequestDispatcher rd;
		if(flag==true)
		{
			rd=request.getRequestDispatcher("success.jsp");
			rd.forward(request, response);
		}
		else
		{
			rd=request.getRequestDispatcher("failure.jsp");
			rd.include(request, response);
		}
		
		
		// TODO Auto-generated method stub
	}

}
