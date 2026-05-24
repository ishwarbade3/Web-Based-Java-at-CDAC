<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>register</title>
<script type="text/javascript" src="resources/js/app.js">
	
</script>
<link rel="stylesheet" href="resources/css/style.css">
</head>
<body align="center">
	<h2>Registration Form</h2>
	<hr>
	<% String msg = (String)request.getAttribute("msg"); if(msg != null){
	%>

	<h3 style="color: red;"><%= msg %></h3>

	<% } %>
	<form action="addEmployee.jsp" method="post" name="regForm">
		<table border="1" align="center">
			<tr>
				<td>Enter First Name:</td>
				<td><input type="text" name="fName"></td>
			</tr>
			<tr>
				<td>Enter Password:</td>
				<td><input type="password" name="pass"></td>
			</tr>
			<tr>
				<td>Enter Email:</td>
				<td><input type="email" name="email"></td>
			</tr>
			<tr>
				<td>Select Gender:</td>
				<td>Male <input type="radio" name="gender" value="male">
					Female <input type="radio" name="gender" value="female">
				</td>
			</tr>
			<tr>
				<td>Select Age Group:</td>
				<td><select name="age">
						<option value="select" selected="selected">select</option>
						<option value="21-25">21-25</option>
						<option value="26-30">26-30</option>
						<option value="31-35">31-35</option>
				</select></td>
			</tr>
			<tr>
				<td><input type="checkbox" name="terms"></td>
				<td>Agree Terms and Conditions!!</td>
			</tr>
			<tr>
				<td><input type="button" value="Back"
					onclick="location.href='index.jsp'"></td>
				<td><input type="submit" value="REGISTER"></td>
			</tr>
		</table>
	</form>
</body>
</html>


<!-- http://localhost:8080/MyApp/ -->
