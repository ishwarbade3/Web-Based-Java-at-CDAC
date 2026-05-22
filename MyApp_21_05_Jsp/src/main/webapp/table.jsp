<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>s
<% int no = Integer.parseInt(request.getParameter("num")); %>
<table border="1">
<%for(int i=1 ; i<=10;i++){ %>
<tr><td> <%= (no*i) %>
</td></tr>
<%} %>
</table>
isGreater than 14 > 13  :<%=(14>13) %><br>
Addition 13+3 : <%=(13+3) %><br>

</body>
</html>