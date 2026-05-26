<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.app.dao.StudentDAO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="s" class="com.app.bean.Student" />
	<jsp:setProperty property="*" name="s" />
	<%
	int i = StudentDAO.add(s);
	if (i == 1) {
		response.sendRedirect("login.jsp");
	} else {
		response.sendRedirect("error.jsp");
	}
	%>

</body>
</html>