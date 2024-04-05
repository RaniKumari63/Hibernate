<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body >
<%HttpSession ses=request.getSession(false);
String uname1=(String)ses.getAttribute("uname1");
String upwd1=(String)ses.getAttribute("upwd1"); 
ses.setAttribute("uname1", uname1);
ses.setAttribute("upwd1", upwd1);
%>
<div align="center">
<h3 style="color:blue;">
 Failure</h3>
<a href="registration.jsp">Registration</a>
</div>
</body>
</html>