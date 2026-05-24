<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="com.app.bean.Customer,java.util.*"%>
<%@ taglib uri="jakarta.tags.core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	List<Customer> list = (List<Customer>) request.getAttribute("list");
	pageContext.setAttribute("list", list);
	%>
	<table border="1">
		<thead>
			<tr>
				<th>First_Name</th>
				<th>Last_Name</th>
				<th>Age</th>
				<th>Status</th>
				<th>Avilibility</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="temp" items="${list}">
				<tr>
					<td>${temp.fName}</td>
					<td>${temp.lName}</td>
					<td>${temp.age}</td>
					<td>${temp.status}</td>
					<c:choose>
						<c:when test="${temp.status}">
							<td>Avilable</td>
						</c:when>
						<c:otherwise>
							<td>Not-Avilable</td>
						</c:otherwise>
					</c:choose>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>