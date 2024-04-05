<%@page import="com.suchiit.daoimpl.AdminUserDaoImpl"%>
<%@page import="com.suchiit.dao.AdminUserDao"%>
<%@page import="com.suchiit.entity.AdminUserCourse"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!


%>
<%HttpSession ses=request.getSession(false);
String uname1=(String)ses.getAttribute("uname1");
String upwd1=(String)ses.getAttribute("upwd1"); 
ses.setAttribute("uname1", uname1);
ses.setAttribute("upwd1", upwd1);

int userno= Integer.parseInt(request.getParameter("uid"));

String uname=request.getParameter("uname");
String upwd=request.getParameter("upwd");
String uemail=request.getParameter("uemail");
long umobile=Long.parseLong(request.getParameter("umobile"));
String utype=request.getParameter("utype");
String cname=request.getParameter("cname");

AdminUserCourse useradmincourse=new AdminUserCourse(uname,upwd,uemail, umobile, utype,cname,userno);
		AdminUserDao daoimpl=new AdminUserDaoImpl();
		boolean flag1=daoimpl.UpdateAdminUser(useradmincourse);

	 RequestDispatcher rd;
		if(flag1==true)
		{
			rd=request.getRequestDispatcher("success.jsp");
			rd.forward(request, response);
		}
		else
		{
			rd=request.getRequestDispatcher("failure.jsp");
			rd.include(request, response);
		}
		
 
%>


</body>
</html>