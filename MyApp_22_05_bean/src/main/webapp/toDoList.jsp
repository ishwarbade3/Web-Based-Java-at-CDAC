<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body align="center">
	<form action="toDoList" method="post">

		Enter an Item : <input type="text" name="item"> <input
			type="submit" value="add">
	</form>
	<%
	List<String> list = (List<String>) session.getAttribute("myList");
	if (list == null) {
		list = new ArrayList<String>();
		session.setAttribute("myList", list);
	}
	String item = request.getParameter("item");
	if (item != null && item != "") {
		list.add(item);
	}
	%>
	<hr>
	<hr>

	<h2>To Do List</h2>
	<ol>
		<%
		for (String str : list) {
			out.println(str);
		}
		%>

	</ol>
	<h2>To Do List</h2>
	<ol>
		<%
		for (String str : list) {
			out.write(str);
		}
		%>

	</ol>

</body>
</html>