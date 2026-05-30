<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.error {
	color: red;
}
</style>
</head>
<body>
	<form:form>
		<table>
			<tr>
				<td>First Name</td>
				<td><form:input path="fName" /></td>
			</tr>
			<tr>
				<td>Last Name</td>
				<td><form:input path="lName" /></td>
			</tr>
			<tr>
				<td><form:button name="submit">Submit</form:button></td>

			</tr>


		</table>





	</form:form>


</body>
</html>