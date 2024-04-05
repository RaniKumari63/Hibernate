<%@page import="com.suchiit.entity.AdminUserCourse"%>
<%@page import="java.util.List"%>
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
<a href="adminlogin.jsp">Back</a>
<table border=1 >
<tr><th>UserId</th><th>UserName</th><th>UserPwd</th><th>UserEmail</th><th>UserMobile</th><th>UserType</th><th>Cid</th><th>Cname</th><th>Cduration</th><th>Cfee</th><th>Delete</th><th>Update</th></tr>
<%!
AdminUserDao daoimpl=new AdminUserDaoImpl();%>
<%
HttpSession ses=request.getSession(false);
String uname1=(String)ses.getAttribute("uname1");
String upwd1=(String)ses.getAttribute("upwd1"); 
ses.setAttribute("uname1", uname1);
ses.setAttribute("upwd1", upwd1);

List <Object[]> adminusercourse=daoimpl.viewAdminUser();
for(Object[] adminuser:adminusercourse)
{
%>

<tr>
<td><%=adminuser[8] %></td>
<td><%=adminuser[0] %></td>

<td><%=adminuser[1] %>
</td>
<td><%=adminuser[2] %>
</td>
<td><%=adminuser[3] %>
</td>
<td><%=adminuser[4] %>
</td>
<td><%=adminuser[9] %>
</td>
<td><%=adminuser[5] %>
</td>
<td><%=adminuser[6] %>
</td>	
<td><%=adminuser[7] %>

</td>
<td><a href="delete.jsp?uid=<%=adminuser[8]%>">Delete</a>
</td>
<td><a href="update.jsp?uid=<%=adminuser[8] %>">Update</a></td>
<%} %>
</table>
</body>
</html>
