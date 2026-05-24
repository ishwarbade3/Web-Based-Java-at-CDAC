<%@page import="com.app.dao.EmployeeDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="e" class="com.app.bean.Employee"></jsp:useBean>
	<jsp:setProperty property="*" name="e" />
	<%
	if (e.getfName() == null || e.getfName().trim().isEmpty() || e.getAge() == null || e.getAge().trim().isEmpty()
			|| e.getEmail() == null || e.getEmail().trim().isEmpty() || e.getGender() == null
			|| e.getGender().trim().isEmpty() || e.getPass() == null || e.getPass().trim().isEmpty()) {

		request.setAttribute("msg","Enter All Field!! ");

		request.getRequestDispatcher("index.jsp").forward(request, response);
		//response.sendRedirect("addEmployee.jsp");
	 %>
	<%--<script>
		alert("Enter all the Fields!!");
		window.location = "index.html";
	</script> --%>
	<%
	} else {
	int i = EmployeeDAO.save(e);
	if (i == 1)
		response.sendRedirect("viewEmployee.jsp");
	else
		response.sendRedirect("error.jsp");
	}
	%>
</body>
</html>