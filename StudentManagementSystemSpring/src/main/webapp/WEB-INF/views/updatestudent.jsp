<%@ page language="java"
contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">

<title>Update Student</title>

</head>

<body>

<h1>
Update Student
</h1>

<form action="/StudentManagementSystemSpring/update"
method="post">

ID:

<input type="text"
name="id"
value="${student.id}"
readonly>

<br><br>

Name:

<input type="text"
name="name"
value="${student.name}">

<br><br>

Email:

<input type="text"
name="email"
value="${student.email}">

<br><br>

<input type="submit"
value="Update Student">

</form>

<br><br>

<a href="/StudentManagementSystem/view">
Back
</a>

</body>

</html>