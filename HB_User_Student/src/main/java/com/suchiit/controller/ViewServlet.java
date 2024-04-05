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
 * Servlet implementation class ViewServlet
 */
public class ViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	int uid=Integer.parseInt(request.getParameter("uid"));
	UserDao daoimpl=new UserDaoImpl();
	UserEntity user=daoimpl.getUserDetails(uid);
	
	RequestDispatcher rd=null;
	if(user!=null)
	 {
		rd=request.getRequestDispatcher("./display.jsp?'uid="+user.getUid()+"'") ;
		rd.forward(request, response);
	 }
	else
		
	{
		rd=request.getRequestDispatcher("./norecord.jsp") ;
		rd.forward(request, response);
	}
	
	}

}
