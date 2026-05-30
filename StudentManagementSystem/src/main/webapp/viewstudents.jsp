<%@ taglib prefix="c"
uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>View Students</title>
</head>

<body>

<h2>Student Records</h2>

<table border="1">

<tr>

<th>ID</th>
<th>Name</th>
<th>Email</th>

</tr>

<c:forEach var="s"
items="${students}">

<tr>

<td>${s.id}</td>
<td>${s.name}</td>
<td>${s.email}</td>

</tr>

</c:forEach>

</table>

<br><br>

<a href="home.jsp">
Back to Home
</a>

</body>
</html>