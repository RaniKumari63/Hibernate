<%@page import="com.suchiit.daoimpl.AdminUserDaoImpl"%>
<%@page import="com.suchiit.dao.AdminUserDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%HttpSession ses=request.getSession(false);
String uname1=(String)ses.getAttribute("uname1");
String upwd1=(String)ses.getAttribute("upwd1"); 
ses.setAttribute("uname1", uname1);
ses.setAttribute("upwd1", upwd1);
AdminUserDao daoimpl=new AdminUserDaoImpl();
int uid=Integer.parseInt(request.getParameter("uid"));
boolean flag=daoimpl.deleteSpecific(uid);
RequestDispatcher rd=request.getRequestDispatcher("view.jsp");
rd.forward(request, response);
%>


</body>
</html>