<%@ page language="java"
contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<%@ taglib uri=
"http://java.sun.com/jsp/jstl/core"
prefix="c"%>

<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">

<title>View Students</title>

</head>

<body>

<h1>
All Students
</h1>

<table border="1"
cellpadding="10">

<tr>

<th>ID</th>

<th>Name</th>

<th>Email</th>

<th>Delete</th>

<th>Edit</th>

</tr>

<c:forEach var="s"
items="${students}">

<tr>

<td>
${s.id}
</td>

<td>
${s.name}
</td>

<td>
${s.email}
</td>

<td>

<a href="delete/${s.id}">
Delete
</a>

</td>

<td>

<a href="edit/${s.id}">
Edit
</a>

</td>

</tr>

</c:forEach>

</table>

<br><br>

<a href="add">
Add New Student
</a>

</body>

</html>