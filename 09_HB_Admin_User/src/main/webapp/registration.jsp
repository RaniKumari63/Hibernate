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
ses.setAttribute("upwd1", upwd1); %>
<a href="adminlogin.jsp">Back</a>
<form action="./register" method="post">
<h3  style=color:"blue" align="center">
RegistrationForm

</h3>
<table border=1 align="center">


<tr>
<td>Enter UserName</td>
<td>

<input type="text" name="uname"/>

</td>
</tr>
<tr>
<td>Enter Password</td>
<td>

<input type="password" name="upwd"/>

</td>
</tr>
<tr>
<td>Enter UserEmail</td>
<td>

<input type="text" name="useremail"/>

</td>
</tr>
<tr>
<td>Enter MobileNumber</td>
<td><input type="text" name="umobile"/></td>
</tr>
<tr>
<td>Enter Utype</td>

<td>
<input type="text" name="utype"/>

</td>
</tr>

<tr>
<td>Enter CourseId</td>
<td>

<input type="text" name="courseid"/>

</td>
</tr>


<tr>
<td colspan="2" align="center">


<input type="submit" name="Login"/>

</td>
</tr>

</table>


</form>

</body>
</html>