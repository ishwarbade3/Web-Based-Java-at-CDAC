<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>

<body align="center">

	<h1>Student Login</h1>

	<form action="loginServlet" method="post">

		<label>PRN :</label> <input type="text" name="prn" required> <br>
		<br> <label>Password :</label> <input type="password" name="pass"
			required> <br>
		<br>

		<button type="submit">Login</button>

	</form>

	<h3 style="color: red;">
		<%=request.getAttribute("msg") == null ? "" : request.getAttribute("msg")%>
	</h3>

</body>
</html>