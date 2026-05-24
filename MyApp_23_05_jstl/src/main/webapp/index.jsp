<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ taglib prefix="fn" uri="jakarta.tags.functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:set var="num" value="100" />
	Num :
	<c:out value="${num }" />
	<br> Greater Than :
	<c:out value="${15>20 }" />
	<c:set var="name" value="ishwar" />
	<br> Name:
	<c:out value="${fn:length(name) }" />

	<hr>
	<hr>

	<h2>
		<a href="serv1">Click Here.....</a>
	</h2>


</body>
</html>