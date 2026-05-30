<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="jakarta.tags.core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>listCustomer</title>
</head>
<body>
	<h2>CRM - Customer relationShip Manager</h2>
	<hr>

	<input type="button" value="Add Customer"
		onclick="window.location.href='showForm';return false;" />
	<br>
	<br>
	<table border="">
		<tr>
			<th>FirstName</th>
			<th>LastName</th>
			<th>Email</th>
			<th>Update</th>
			<th>Delete</th>
		</tr>
		<c:forEach var="tempCustomer" items="${customer}">
			<c:url var="updateLink" value="/customer/showFormForUpdate">
				<c:param name="customerId" value="${tempCustomer.id}"></c:param>
			</c:url>
			<c:url var="deleteLink" value="/customer/delete">
				<c:param name="customerId" value="${tempCustomer.id}"></c:param>
			</c:url>
			<tr>
				<td>${tempCustomer.firstName}</td>
				<td>${tempCustomer.lastName}</td>
				<td>${tempCustomer.email}</td>
				<td><a href="${updateLink}">Update</a></td>
				<td><a href="${deleteLink}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>