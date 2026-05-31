<%@ page language="java"
contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">

<title>Add Student</title>

</head>

<body>

<h1>
Add Student
</h1>

<form action="save"
method="post">

ID:

<input type="text"
name="id">

<br><br>

Name:

<input type="text"
name="name">

<br><br>

Email:

<input type="text"
name="email">

<br><br>

<input type="submit"
value="Save Student">

</form>

<br><br>

<a href="view">
View Students
</a>

</body>

</html>