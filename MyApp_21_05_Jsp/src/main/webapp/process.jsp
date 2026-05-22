<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	String u = request.getParameter("user");
	%>
	<%
	String p = request.getParameter("pass");
	%>
	<%
	if (u.equals("admin") && p.equals("admin123")) {
		out.write("Login SucessFull!!!!!!!");
		response.sendRedirect("division.jsp");
	} else {
		out.write("Invalid Username and Password ");
		request.getRequestDispatcher("login.jsp").include(request, response);
	}
	%>
	

</body>
</html>