<%@page import="com.suchiit.pojo.UserEntity"%>
<%@page import="com.suchiit.daoimpl.UserDaoImpl"%>
<%@page import="com.suchiit.dao.UserDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

int uid=Integer.parseInt(request.getParameter("uid"));
	UserDao daoimpl=new UserDaoImpl();
	UserEntity user=daoimpl.getUserDetails(uid);%>
	<table border="1" align="center">
	<tr>
	<td>
	UserId
	</td>
	<td>
	<%=user.getUid() %>
	</td>
	</tr>
	<tr>
	<td>
	Fname
	</td>
	<td>
	<%=user.getFname() %>
	</td>
	</tr>
	<tr>
	<td>
	Lname
	</td>
	<td>
	<%=user.getLname() %>
	</td>
	</tr>
	<tr>
	<td>
	Email
	</td>
	<td>
	<%=user.getEmail() %>
	</td>
	</tr>
	<tr>
	<td>
	MobileNumber
	</td>
	<td>
	<%=user.getMobilenumber() %>
	</td>
	</tr>
	<tr>
	<td>
	Password
	</td>
	<td>
	<%=user.getPwd() %>
	</td>
	</tr>
	</table>
	
</body>
</html>