<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="processForm" method="post" modelAttribute="student">
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
				<td>Select Country</td>
				<td><form:select path="country">
						<form:options items="${student.countryOptions}" />
					</form:select></td>
			</tr>
			<tr>
				<td>Select Fvourite Language</td>
				<td>Java<form:radiobutton path="favouriteLanguage" value="Java" />
					Cpp<form:radiobutton path="favouriteLanguage" value="Cpp" />
					MicroServices<form:radiobutton path="favouriteLanguage"
						value="MicroServices" />
				</td>

			</tr>
			<tr>
				<td>Select Operating System</td>
				<td>Window <form:checkbox path="operatingSystem" value="Window" />
					Mac <form:checkbox path="operatingSystem" value="Mac" /> Linux <form:checkbox
						path="operatingSystem" value="Linux" />
				</td>

			</tr>
			<tr>
				<td><form:button name="submit" >Submit</form:button></td>

			</tr>
		</table>









	</form:form>

</body>
</html>