<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="e" class="com.app.bean.Employee">
	</jsp:useBean>
	
	<jsp:setProperty property="*" name="e"/>
	
	Employee Details : 
	
<br><br>

<jsp:getProperty property="fName" name="e"/>
<br><br>
<jsp:getProperty property="lName" name="e"/>
<br><br>
<jsp:getProperty property="age" name="e"/>
<br><br>

</body>
</html>