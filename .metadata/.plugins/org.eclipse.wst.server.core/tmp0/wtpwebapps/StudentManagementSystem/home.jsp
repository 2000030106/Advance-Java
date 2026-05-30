<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<%
String user =
(String)session.getAttribute("username");

if(user == null) {

    response.sendRedirect("login.jsp");
}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>

<body>

<h1>Welcome <%= user %></h1>

<br><br>

<a href="addstudent.jsp">
Add Student
</a>

<br><br>

<a href="view">
View Students
</a>

<br><br>

<a href="logout">
Logout
</a>

</body>
</html>