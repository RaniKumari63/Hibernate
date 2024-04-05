<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
	ul
	
	{display: block;
	list-style-type:none;
	margin:0;
	padding:0;
	width:200px;
	 background-color: #f1f1f1;
	 }
	 
	 li a {
  display: block;
  width: 200px;
  background-color: #dddddd;
}
li a:hover {
  background-color: #555;
  color: white;
}
</style>
</head>
<body>
<%HttpSession ses=request.getSession(false);
String uname1=(String)ses.getAttribute("uname1");
String upwd1=(String)ses.getAttribute("upwd1"); 
ses.setAttribute("uname1", uname1);
ses.setAttribute("upwd1", upwd1);
%>
<h3 style="color:blue;" align="center">
User Form</h3>
<ul>
<li><a href="registration.jsp">Registration</a></li>

<li><a href="view.jsp">View</a></li>
<li><a href="display.jsp">ViewSpecific</a></li>


</ul>

 
</body>
</html>