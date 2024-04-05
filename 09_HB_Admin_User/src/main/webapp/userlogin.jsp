<%@page import="com.suchiit.entity.AdminUserCourse"%>
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
<%!


AdminUserDao daoimpl=new AdminUserDaoImpl();%>

<%HttpSession ses=request.getSession(false);
String uname1=(String)ses.getAttribute("uname1");
String upwd1=(String)ses.getAttribute("upwd1"); 
ses.setAttribute("uname1", uname1);
ses.setAttribute("upwd1", upwd1);
String uname=request.getParameter("uname");
String upwd=request.getParameter("upwd");
int uid=daoimpl.getUserId(uname, upwd);
System.out.println(uid);
AdminUserCourse adminuser=daoimpl.viewAdminUserspecific(uid);
%>
<h3 style="color:blue;" align="center">
User Details</h3>
<table border="1" align="center">
	<tr>
	<td>
	UserId
	</td>
	<td>
	<%=adminuser.getUserno() %>
	</td>
	</tr>
	<tr>
	<td>
	UserName
	</td>
	<td>
	<%=adminuser.getUserName() %>
	</td>
	</tr>
	<tr>
	<td>
	UserPwd
	</td>
	<td>
	<%=adminuser.getUserPwd() %>
	</td>
	</tr>
	<tr>
	<td>
	UserEmail
	</td>
	<td>
	<%=adminuser.getUserEmail() %>
	</td>
	</tr>
	<tr>
	<td>
	UserMobile
	</td>
	<td>
	<%=adminuser.getUserMobileNumber() %>
	</td>
	</tr>
	<tr>
	<td>
	UserType
	</td>
	<td>
	<%=adminuser.getUserType()%>
	</td>
	</tr>
	<tr>
	<td>
CourseName
	</td>
	<td>
	<%=adminuser.getCname() %>
	</td>
	</tr>
	<tr>
	<td>
CourseDuration
	</td>
	<td>
	<%=adminuser.getCduration() %>
	</td>
	</tr>
		<tr>
	<td>
CourseFee
	</td>
	<td>
		<%=adminuser.getCfee() %>
	</td>
	</tr>
	</table>
</body>
</html>