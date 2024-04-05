<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="./login" method="post">
<h3  style=color:"blue" align="center">
Admin/UserLoginForm

</h3>
<table border=1 align="center">
<tr>
<td>Enter UserName</td>
<td>

<input type="text" name="uname"/>

</td>
<tr>
<td>Enter Password</td>
<td>

<input type="password" name="upwd"/>

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