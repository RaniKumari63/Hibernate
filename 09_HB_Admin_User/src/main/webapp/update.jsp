
<%@page import="com.suchiit.entity.AdminUserCourse"%>
<%@page import="com.suchiit.daoimpl.AdminUserDaoImpl"%>
<%@page import="com.suchiit.dao.AdminUserDao"%>
<%! 
int uid1;
%>
<% 
HttpSession ses=request.getSession(false);
String uname1=(String)ses.getAttribute("uname1");
String upwd1=(String)ses.getAttribute("upwd1"); 
ses.setAttribute("uname1", uname1);
ses.setAttribute("upwd1", upwd1);
uid1=Integer.parseInt(request.getParameter("uid"));
AdminUserDao daoimpl=new AdminUserDaoImpl();
System.out.println("\tcc"+uid1);
AdminUserCourse adminuser=daoimpl.viewAdminUserspecific(uid1);
%>

<html>
<body>
<form action="./updatesubmit.jsp">
<table>
<tr><td>UserId</td>
<td><input type='hidden' name='uid' value=<%=adminuser.getUserno()%> ></td></tr>
<tr><td>UserName</td>
<td><input type='text' name='uname' value=<%=adminuser.getUserName()%> ></td></tr>
<tr><td>UserPwd</td>
<td><input type='text' name='upwd' value=<%=adminuser.getUserPwd()%>></td></tr>
 <tr><td>UserEmail</td>
<td><input type='text' name='uemail' value=<%=adminuser.getUserEmail()%>></td></tr>
 <tr><td>UserMobile</td>
<td><input type='text' name='umobile' value=<%=adminuser.getUserMobileNumber()%>></td></tr>
<tr><td>UserType</td>
<td><input type='text' name='utype' value=<%=adminuser.getUserType()%>></td></tr>

<tr><td>Cname</td>
<td><input type='text' name='cname' value=<%=adminuser.getCname()%>></td></tr>

<tr><td><input type='submit' value='update'/></td></tr>
</table>
</form>
</body>
</html>