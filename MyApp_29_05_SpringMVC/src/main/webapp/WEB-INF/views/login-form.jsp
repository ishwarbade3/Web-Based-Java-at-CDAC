<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="processForm" method="post">
		<table>
			<tr>
				<td>Enter UserName</td>
				<td><input type="text" value="user" name="user"></td>
			</tr>
			<tr>
				<td>Enter Password</td>
				<td><input type="text" value="pass" name="pass"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit"  name="submit"></td>
			</tr>

		</table>
	</form>

</body>
</html>