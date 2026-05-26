<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
<title>login</title>

</head>

<body align="center">
	<div class="main">
		<h1>Student Login</h1>
		<h3>Enter your login credentials</h3>

		<form action=profile.jsp align="center" border="1">
			<label for="first"> Username: </label> <input
				type="text" id="first" name="first"
				placeholder="Enter your Username" required> <br> <br> <label
				for="password"> Password: </label> <input type="password"
				id="password" name="password" placeholder="Enter your Password"
				required> <br> <br>

			<div class="wrap">
				<button type="submit">Submit</button>
			</div>
		</form>

		<p>
			Not registered? <a href="registration.jsp"> Create an account </a>
		</p>
	</div>
</body>

</html>