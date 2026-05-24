<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="com.app.bean.Customer,java.util.*"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ taglib prefix="fn" uri="jakarta.tags.functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	List<Customer> list = new ArrayList<Customer>();
	list.add(new Customer("Ashish", "Rathi", 21));
	list.add(new Customer("sai", "Ambekar", 17));
	list.add(new Customer("varun", "Kirtane", 15));
	list.add(new Customer("Sidd", "Borekar", 23));
	list.add(new Customer("Mayuri", "fakirpure", 30));

	pageContext.setAttribute("list", list);
	%>
	<table>
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Age</th>
			<th>Status</th>
		</tr>
		<c:forEach var="temp" items="${list}">
			<tr>
				<td>${temp.fName }</td>
				<td>${temp.lName }</td>
				<td>${temp.age }</td>
				<c:if test="${temp.age>=18 }">
					<td>Eligible</td>
				</c:if>
				<c:if test="${temp.age<18 }">
					<td>Not-Eligible</td>
				</c:if>
			</tr>
		</c:forEach>
	</table>
</body>
</html>