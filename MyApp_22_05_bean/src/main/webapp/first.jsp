<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:forward page="second.jsp" >

<jsp:param value="India" name="Country"/>
<jsp:param value="MH" name="State"/>
<jsp:param value="Beed" name="City"/>
</jsp:forward>

</body>
</html>