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
<body>

<h1>Welcome <%= user %></h1>

<a href="logout">Logout</a>

</body>
</html>